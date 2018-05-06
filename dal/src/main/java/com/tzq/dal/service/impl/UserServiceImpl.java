package com.tzq.dal.service.impl;

import com.github.pagehelper.PageHelper;
import com.tzq.dal.mapper.UserMapper;
import com.tzq.dal.model.User;
import com.tzq.dal.model.UserExample;
import com.tzq.dal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/3
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    /*
    * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
    * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
    * pageNum 开始页数
    * pageSize 每页显示的数据条数
    * */
    @Override
    public List<User> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        UserExample userExample = new UserExample();
        userExample.setLimitStart(PageHelper.getLocalPage().getStartRow());
        userExample.setLimitEnd(PageHelper.getLocalPage().getPageSize());
        return userMapper.selectByExample(userExample);
    }
}
