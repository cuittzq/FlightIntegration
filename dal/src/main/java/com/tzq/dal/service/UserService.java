package com.tzq.dal.service;

import com.tzq.dal.model.Test;

import java.util.List;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/3
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public interface UserService {
    int addUser(Test user);

    List<Test> findAllUser(int pageNum, int pageSize);
}
