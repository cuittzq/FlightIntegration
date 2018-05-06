package com.tzq.web.controller;

import com.tzq.dal.model.User;
import com.tzq.dal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/3
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
@RestController
@RequestMapping(value = "/demo")
public class TestController {

    @Autowired
    private UserService userService;
    @RequestMapping(value = "/gethello", method = RequestMethod.GET)
    public String gethello() {
        User user = new User();
        user.setAddress("");
        user.setDes("");
        user.setLevel(12312);
        user.setName("test");
        user.setPassword("12312");
        user.setTel("123");
        userService.addUser(user);
        return "hello";
    }
}
