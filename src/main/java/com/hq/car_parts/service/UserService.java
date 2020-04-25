package com.hq.car_parts.service;

import com.hq.car_parts.entity.User;

import java.util.Map;

public interface UserService {
    User findUserByUsername(String username);

    Map findUserInfoByUsername(String username);
}
