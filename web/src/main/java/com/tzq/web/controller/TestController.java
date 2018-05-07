package com.tzq.web.controller;

import com.tzq.dal.model.Test;
import com.tzq.dal.service.UserService;
import com.tzq.web.aop.UserAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

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
    @UserAccess(desc = "gethello")
    public String gethello() {
        Test user = new Test();
        user.setId(121);
        user.setName("test");
        user.setUpdatetime(new Date());
        userService.addUser(user);
        return "hello";
    }
}
