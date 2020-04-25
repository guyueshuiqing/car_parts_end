package com.hq.car_parts.controller;

import cn.hutool.core.util.StrUtil;
import com.hq.car_parts.common.CommonResult;
import com.hq.car_parts.common.JwtTokenUtil;
import com.hq.car_parts.entity.Role;
import com.hq.car_parts.entity.User;
import com.hq.car_parts.service.RoleService;
import com.hq.car_parts.service.UserService;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
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

//    @RequestMapping("/{page}")
//    public String showPage(@PathVariable String page) {
//        return page;
//    }

    @RequestMapping("/findUserById")
    public String findUserById(String username, Model model) {
        User user = this.userService.findUserByUsername(username);
        model.addAttribute("user", user);
        return "updateUser";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody Map<String, String> map) {
        String username = map.get("username");
        String password = map.get("password");
        System.out.println("username："+username+"password："+password);
        if(StrUtil.isEmpty(username) || StrUtil.isEmpty(password)){
            return CommonResult.failed("，用户名和密码不能为空");
        }
        User user = this.userService.findUserByUsername(username);
        if(user == null || !user.getPassword().equals(password)){
            return CommonResult.failed("用户名或密码错误");
        } else {
            Map<String,Object> repMap = new HashMap<>();
            repMap.put("token",jwtTokenUtil.generateToken(user));
            Map repUser = userService.findUserInfoByUsername(username);
            Role repRole = roleService.findRoleByRoleId((Integer) repUser.get("role_id"));
            Map<String,Object> rep = new HashMap<>();
            rep.put("user",repUser);
            rep.put("role",repRole);
            repMap.put("userInfo", rep);
            return CommonResult.success(repMap);
        }
    }


    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult profile(HttpServletRequest request) {
        String username = "123";
        User user = userService.findUserByUsername(username);
        System.out.println(request.getAttribute("user_claims"));
        return CommonResult.success(null,"成功");
    }

}
