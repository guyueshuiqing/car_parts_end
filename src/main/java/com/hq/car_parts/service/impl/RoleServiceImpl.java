package com.hq.car_parts.service.impl;

import com.hq.car_parts.entity.Role;
import com.hq.car_parts.mapper.RoleMapper;
import com.hq.car_parts.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Role findRoleByRoleId(Integer id) {
        return roleMapper.findRoleByRoleId(id);
    }
}
