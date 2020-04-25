package com.hq.car_parts.mapper;

import com.hq.car_parts.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface UserMapper {
    User findUserByUsername(String username);

    Map findUserInfoByUsername(String username);
}
