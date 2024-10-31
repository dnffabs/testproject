package com.example.testproject.service.Impl;

import com.example.testproject.mapper.UserMapper;
import com.example.testproject.pojo.User;
import com.example.testproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUserInfo(String userid) {

        User user = userMapper.selectById(userid);
        System.out.println(user);

        //调用UserMapper的selectById方法，传入userid，返回User对象
        return userMapper.selectById(userid);

    }
}