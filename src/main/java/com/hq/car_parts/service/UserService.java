package com.hq.car_parts.service;

import com.hq.car_parts.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    void insertUser(User user);

    User findUserByUsername(String username);

    Map findUserInfoByUsername(String username);

    User findUserLimitByUsername(String username);

    List<User> findAllUsers();
}
