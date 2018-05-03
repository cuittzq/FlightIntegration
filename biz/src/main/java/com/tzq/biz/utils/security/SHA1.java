package com.tzq.biz.utils.security;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2017/10/24
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class SHA1 {

    private static final String SHA1 = "SHA1";

    private static final String MAC_NAME = "HmacSHA1";

    private static final String ENCODING = "UTF-8";

    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /**
     * 使用 HMAC-SHA1 签名方法对对encryptText进行签名 转BASE64
     *
     * @param encryptText 被签名的字符串
     * @return
     * @throws Exception
     */
    public static String SHA1Encrypt(String encryptText) throws Exception {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SHA1);
            messageDigest.update(encryptText.getBytes("utf-8"));
            return getFormattedText(messageDigest.digest());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 使用 HMAC-SHA1 签名方法对对encryptText进行签名 转BASE64
     *
     * @param encryptText 被签名的字符串
     * @param encryptKey  密钥
     * @return
     * @throws Exception
     */
    public static String HmacSHA1Encrypt(String encryptText, String encryptKey) throws Exception {
        byte[] data = encryptKey.getBytes(ENCODING);
        //根据给定的字节数组构造一个密钥,第二参数指定一个密钥算法的名称
        SecretKey secretKey = new SecretKeySpec(data, MAC_NAME);
        //生成一个指定 Mac 算法 的 Mac 对象
        Mac mac = Mac.getInstance(MAC_NAME);
        //用给定密钥初始化 Mac 对象
        mac.init(secretKey);
        byte[] text = encryptText.getBytes(ENCODING);
        //完成 Mac 操作
        byte[] result = mac.doFinal(text);
        return byte2Base64String(result);
    }

    /**
     * byte[]转base64
     *
     * @param bytes
     * @return
     */
    private static String byte2Base64String(byte[] bytes) {
        return org.apache.commons.codec.binary.Base64.encodeBase64String(bytes);
    }


    /**
     * Takes the raw bytes from the digest and formats them correct.
     *
     * @param bytes
     * @return the formatted bytes.
     */
    private static String getFormattedText(byte[] bytes) {
        int len = bytes.length;
        StringBuilder buf = new StringBuilder(len * 2);
        // 把密文转换成十六进制的字符串形式
        for (int j = 0; j < len; j++) {
            buf.append(HEX_DIGITS[(bytes[j] >> 4) & 0x0f]);
            buf.append(HEX_DIGITS[bytes[j] & 0x0f]);
        }
        return buf.toString();
    }
}
