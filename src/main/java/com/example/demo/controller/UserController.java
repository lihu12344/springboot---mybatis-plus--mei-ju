package com.example.demo.controller;


import com.example.demo.myenum.Sex;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lihu
 * @since 2019-09-17
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    public User save(){
        User user=new User();
        user.setName("瓜田李下");
        user.setAge(23);
        user.setSex(Sex.Female);

        userService.save(user);

        return user;
    }
}

