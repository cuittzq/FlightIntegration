package com.tzq.biz.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by cl24957 on 2018/5/22.
 */
public class OrderNoUtils {
    private static AtomicInteger SERIALS_NUM = new AtomicInteger(0);

    private String salePlatName;
    private String purchasePlatName;

    private String getOrderNo() {
        if (SERIALS_NUM.get() > 99) {
            SERIALS_NUM.set(0);
        } else {
            SERIALS_NUM.incrementAndGet();
        }

        String serialNum = StringUtils.leftPad(SERIALS_NUM.toString(), 2, "0");
        String timestamp = DateConvert.getStrFromDateByFormat(new Date(), DateConvert.ORDERNO_TIME_STAMP);
        return String.format("%s|%s|%s|%s", this.salePlatName, this.purchasePlatName, timestamp, serialNum);
    }

    public static class Builder {
        private OrderNoUtils orderNoUtils;

        private Builder() {
        }

        public static Builder newBuilder() {
            Builder builder = new Builder();
            builder.orderNoUtils = new OrderNoUtils();
            return builder;
        }

        public Builder setSalePlatName(String salePlatName) {
            this.orderNoUtils.salePlatName = salePlatName;
            return this;
        }

        public Builder setPurchasePlatName(String purchasePlatName) {
            this.orderNoUtils.purchasePlatName = purchasePlatName;
            return this;
        }

        public String getOrderNum()
        {
            return this.orderNoUtils.getOrderNo();
        }
    }

    public static void main(String[] args) {
       for(int i = 0;i<20;i++)
       {
           Thread td = new Thread(new Runnable(){
               @Override
               public void run() {
                   System.out.println(OrderNoUtils.Builder.newBuilder().setPurchasePlatName("LCC").setSalePlatName("CTR").getOrderNum());
               }
           });

           td.start();
       }

        System.out.println("测试结束");
    }
}
