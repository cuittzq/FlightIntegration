package com.tzq.biz.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by cl24957 on 2018/5/11.
 */
@Component
public class DateConvert {
    /**
     * 今通日期格式
     */
    public  static final String LCC_VERIFY_DATE_FORMAT="yyyyMMddHHmm";

    public static final String ORDERNO_TIME_STAMP = "yyyyMMddHHmmssSSS";


    /**
     *  根据格式将字符串装换为日期
     * @param sDate
     * @param format
     * @return
     * @throws ParseException
     */
    public static Date getDateFromStrByFormat(String sDate,String format) throws ParseException {
        if(StringUtils.isBlank(format)) {
            throw new ParseException("Null format. ", 0);
        }

        DateFormat dateFormat = new SimpleDateFormat(format);
        if(sDate != null && sDate.length() >= format.length()) {
            return dateFormat.parse(sDate);
        } else {
            throw new ParseException("length too little", 0);
        }
    }

    /**
     *  将日期装换位对应格式的字符串
     * @param sDate
     * @param format
     * @return
     */
    public static String getStrFromDateByFormat(Date sDate,String format)
    {
        return sDate == null?null:(new SimpleDateFormat(format)).format(sDate);
    }
}
