package com.tzq.biz.common.model;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/8
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */

import java.io.Serializable;

/**
 * 实体ID领域模型，所有业务领域模型应实现该接口，提供ID的获取和设置功能
 *
 * @author allen
 * @version $Id: Identifiable.java, v 0.1 2016年2月26日 上午11:10:38 allen Exp $
 */
public interface Identifiable<ID extends Serializable> extends Serializable {

    /**
     * 获取领域模型ID
     *
     * @return 返回ID
     */
    ID getId();

    /**
     * 设置领域模型ID
     *
     * @param id 领域模型ID
     */
    void setId(ID id);

    static final Transformer TRANSFORMER = new Transformer() {

        @SuppressWarnings("unchecked")
        @Override
        public Object transform(Object id) {
            return ((Identifiable<Serializable>) id).getId();
        }

    };
}
