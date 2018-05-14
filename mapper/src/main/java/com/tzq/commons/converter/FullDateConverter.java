package com.tzq.commons.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/14
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
@Component
public class FullDateConverter {

    /**
     * As string string.
     *
     * @param date the date
     * @return the string
     */
    public String asString(Date date) {
        return date != null ? new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date) : null;
    }

    /**
     * As date date.
     *
     * @param date the date
     * @return the date
     */
    public Date asDate(String date) {
        try {
            if(StringUtils.isBlank(date)) {
                return null;
            }
            if (date.length() == 10) {
                return new SimpleDateFormat("yyyy-MM-dd").parse(date);
            } else if(date.length() == 19){
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date);
            } else {
                return DateTime.parse(date).toDate();
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
