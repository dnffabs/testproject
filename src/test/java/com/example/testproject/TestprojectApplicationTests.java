package com.example.testproject;

import com.example.testproject.mapper.UserMapper;
import com.example.testproject.pojo.User;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
//@MapperScan("com.example.testproject.mapper")
@SpringBootTest
class TestprojectApplicationTests {

    @Autowired
    private UserMapper userMapper;


    @Test
    void contextLoads() {
        //wrapper是条件构造器
        List<User> users = userMapper.selectList(null);
        System.out.println(users);

    }

}
