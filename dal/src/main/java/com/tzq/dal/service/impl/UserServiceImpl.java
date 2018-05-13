package com.tzq.dal.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tzq.dal.mapper.TestMapper;
import com.tzq.dal.model.Test;
import com.tzq.dal.model.TestExample;
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
    private TestMapper testMapper;

    @Override
    public int addUser(Test user) {
        return testMapper.insert(user);
    }

    /*
    * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
    * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
    * pageNum 开始页数
    * pageSize 每页显示的数据条数
    * */
    @Override
    public List<Test> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        TestExample userExample = new TestExample();
        userExample.setLimitStart(PageHelper.getLocalPage().getStartRow());
        userExample.setLimitEnd(PageHelper.getLocalPage().getPageSize());
        TestExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(100);
        userExample.setOrderByClause("LAST_UPD_TM DESC");//根据LAST_UPD_TM排序
        return testMapper.selectByExample(userExample);
    }
}
