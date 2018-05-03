package com.tzq.dal.service;

import com.tzq.dal.model.User;

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
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
