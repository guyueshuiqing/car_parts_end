package com.hq.car_parts.service.impl;

import com.hq.car_parts.entity.User;
import com.hq.car_parts.mapper.UserMapper;
import com.hq.car_parts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public User findUserByUsername(String username) {
        return userMapper.findUserByUsername(username);
    }

    @Override
    public Map findUserInfoByUsername(String username) {
        return userMapper.findUserInfoByUsername(username);
    }

    @Override
    public User findUserLimitByUsername(String username) {
        return userMapper.findUserLimitByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return userMapper.findAllUsers();
    }

    @Override
    public void deleteUserByUsername(String username) {
        userMapper.deleteUserByUsername(username);
    }

    @Override
    public void updateUserRole(User user) {
        userMapper.updateUserRole(user);
    }

}
