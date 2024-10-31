package com.example.testproject.controller;

import com.example.testproject.pojo.Result;
import com.example.testproject.pojo.User;
import com.example.testproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class Usercontroller {

    @Autowired
    private UserService userservice;

    //获取用户信息1
    @GetMapping("/getinfo")
    public Result<User> getUserInfo(String userid) {
        User user = userservice.getUserInfo(userid);
        return Result.success(user);
    }

}