package com.hq.car_parts.mapper;

import com.hq.car_parts.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    void insertUser(User user);

    User findUserByUsername(String username);

    Map findUserInfoByUsername(String username);

    User findUserLimitByUsername(String username);

    List<User> findAllUsers();

    void deleteUserByUsername(String username);

    void updateUserRole(User user);
}
