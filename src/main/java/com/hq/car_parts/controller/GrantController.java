package com.hq.car_parts.controller;

import com.hq.car_parts.common.CommonResult;
import com.hq.car_parts.entity.User;
import com.hq.car_parts.entity.grant.StaffLimitMenus;
import com.hq.car_parts.entity.grant.StaffMenu;
import com.hq.car_parts.mapper.UserMapper;
import com.hq.car_parts.service.grant.StaffLimitMenusService;
import com.hq.car_parts.service.grant.StaffMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/anth")
public class GrantController {
    @Autowired
    private StaffMenuService staffMenuService;
    @Autowired
    private StaffLimitMenusService limitMenusService;
    @Autowired
    private UserMapper userMapper;


    @RequestMapping(value = "/cancelGrant", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult cancelGrant(@RequestBody Map<String, String> map) {
        String username = map.get("username");
        String menuItem = map.get("menuItem");
        StaffMenu staffMenu = staffMenuService.findLimitByLimitName(menuItem);
        StaffLimitMenus staffLimitMenus = new StaffLimitMenus(username,staffMenu.getId());
        StaffLimitMenus limit = limitMenusService.findLimitByNameAndLimit(staffLimitMenus);
        System.out.println(limit+"limit");
        limitMenusService.deleteStaffLimit(limit.getId());

        return CommonResult.success(null,"授权取消成功！");
    }

    @RequestMapping(value = "/grant", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult grant(@RequestBody Map<String, String> map) {
        String username = map.get("username");
        String menuItem = map.get("menuItem");
        StaffMenu staffMenu = staffMenuService.findLimitByLimitName(menuItem);
        StaffLimitMenus staffLimitMenus = new StaffLimitMenus(username,staffMenu.getId());
        limitMenusService.insertStaffLimit(staffLimitMenus);

        return CommonResult.success(null,"授权成功！");
    }

    @RequestMapping(value = "/updateRole", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult updateRole(@RequestBody Map<String,String> map) {
        String username = map.get("username");
        String role = map.get("role");
        System.out.println(username+"哈哈哈"+role);
        User findUser = userMapper.findUserByUsername(username);
        User user = null;
        if(new String("upgrade").equals(role)){
            user = new User(username,findUser.getRoleId()+1);
        }
        if(new String("fall").equals(role)){
            user =new User(username,findUser.getRoleId()-1);
        }
        if(user == null){
            return CommonResult.failed("用户不存在！");
        }
        userMapper.updateUserRole(user);
        return CommonResult.success(null,"权限更新成功！");
    }

}
