package com.hq.car_parts.service.impl;

import com.hq.car_parts.entity.User;
import com.hq.car_parts.mapper.UserMapper;
import com.hq.car_parts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Override
    public User findUserByUsername(String username) {
//        User user = (User) redisTemplate.opsForValue().get(username);
//        if(null == user){
//            user = userMapper.findUserByUsername(username);
//            redisTemplate.opsForValue().set(username,user);
//        }
        return userMapper.findUserByUsername(username);
    }

    @Override
    public Map findUserInfoByUsername(String username) {
        return userMapper.findUserInfoByUsername(username);
    }
}