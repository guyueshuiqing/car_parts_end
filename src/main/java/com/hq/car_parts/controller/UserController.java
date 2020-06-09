package com.hq.car_parts.controller;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.hq.car_parts.common.CommonResult;
import com.hq.car_parts.common.CookieUtils;
import com.hq.car_parts.common.JwtTokenUtil;
import com.hq.car_parts.common.exception.ApiException;
import com.hq.car_parts.entity.Role;
import com.hq.car_parts.entity.grant.StaffMenu;
import com.hq.car_parts.entity.User;
import com.hq.car_parts.service.RoleService;
import com.hq.car_parts.service.UserService;
import com.hq.car_parts.service.grant.StaffMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody Map<String, String> map) {
        String username = map.get("username");
        String password = map.get("password");
        System.out.println("username："+username+"password："+password);
        if(StrUtil.isEmpty(username) || StrUtil.isEmpty(password)){
            return CommonResult.failed("，用户名和密码不能为空");
        }

        User luser = userService.findUserLimitByUsername(username);

        User user = this.userService.findUserByUsername(username);
        if(user == null || !user.getPassword().equals(password)){
            return CommonResult.failed("用户名或密码错误");
        } else {
            Map<String,Object> repMap = new HashMap<>();
            repMap.put("token",jwtTokenUtil.generateToken(user));
            Map<String,Object> repUser = new HashMap<>();
//            `user`.username username,`user`.real_name real_name,`user`.email email,`user`.role_id role_id,staff_menu.limit_name
            List<String> limitList = new ArrayList<String>();
            List<StaffMenu> list = luser.getStaffMenus();
            for (StaffMenu s : list){
                limitList.add(s.getLimitName());
            }
            repUser.put("username",luser.getUsername());
            repUser.put("real_name",luser.getRealName());
            repUser.put("email",luser.getEmail());
            repUser.put("role_id",luser.getRoleId());
            repUser.put("limit", limitList);
            Role repRole = roleService.findRoleByRoleId((Integer) repUser.get("role_id"));
            Map<String,Object> rep = new HashMap<>();
            rep.put("user",repUser);
            rep.put("role",repRole);
            repMap.put("userInfo", rep);
            return CommonResult.success(repMap);
        }
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult register(@RequestBody Map<String, String> map) {
        String username = map.get("username");
        User findUser = userService.findUserByUsername(username);
        System.out.println(ObjectUtil.isNotEmpty(findUser));
        System.out.println(ObjectUtil.isEmpty(findUser));
        if(ObjectUtil.isNotEmpty(findUser)){
            return CommonResult.failed("用户已存在");
        }
        User user = new User(map);
        userService.insertUser(user);
        return CommonResult.success(null,"注册成功！");
    }

    @RequestMapping(value = "/userInfo", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult userInfo(@RequestBody Map<String, String> map) {
        String username = map.get("username");
        User luser = userService.findUserLimitByUsername(username);
        Map<String,Object> repMap = new HashMap<>();

        Map<String,Object> repUser = new HashMap<>();
        List<String> limitList = new ArrayList<String>();
        List<StaffMenu> list = luser.getStaffMenus();
        for (StaffMenu s : list){
            limitList.add(s.getLimitName());
        }
        repUser.put("username",luser.getUsername());
        repUser.put("real_name",luser.getRealName());
        repUser.put("email",luser.getEmail());
        repUser.put("role_id",luser.getRoleId());
        repUser.put("limit", limitList);
        Role repRole = roleService.findRoleByRoleId((Integer) luser.getRoleId());
        Map<String,Object> rep = new HashMap<>();
        rep.put("user",repUser);
        rep.put("role",repRole);

        repMap.put("userInfo", rep);
        return CommonResult.success(repMap,"成功");
    }


    @RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAllUser() {
        List<User> users = userService.findAllUsers();
        List<Map<String,Object>> repUsers = new ArrayList<Map<String, Object>>();

        for (User user : users){
            User luser = userService.findUserLimitByUsername(user.getUsername());
            Map<String,Object> repMap = new HashMap<>();
            Map<String,Object> repUser = new HashMap<>();
            List<String> limitList = new ArrayList<String>();
            List<StaffMenu> list = luser.getStaffMenus();
            for (StaffMenu s : list){
                limitList.add(s.getLimitName());
            }
            repUser.put("username",luser.getUsername());
            repUser.put("real_name",luser.getRealName());
            repUser.put("email",luser.getEmail());
            repUser.put("role_id",luser.getRoleId());
            repUser.put("limit", limitList);
            Role repRole = roleService.findRoleByRoleId((Integer) luser.getRoleId());
            Map<String,Object> rep = new HashMap<>();
            rep.put("user",repUser);
            rep.put("role",repRole);
            repUsers.add(rep);
        }

        return CommonResult.success(repUsers,"成功");
    }

    @RequestMapping(value = "/deleteUser/{username}",method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult deleteUser(@PathVariable String username){
        System.out.println(username+"username++");
        try {
            userService.deleteUserByUsername(username);
            return CommonResult.success(null,"删除成功！");
        }catch (ApiException e){
            return CommonResult.failed("删除异常");
        }
    }
}
