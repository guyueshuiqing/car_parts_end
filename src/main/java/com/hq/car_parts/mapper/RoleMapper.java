package com.hq.car_parts.mapper;

import com.hq.car_parts.entity.Role;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMapper {
    Role findRoleByRoleId(Integer id);
}
