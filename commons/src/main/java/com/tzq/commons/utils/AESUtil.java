package com.tzq.commons.utils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/8
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class AESUtil {

    /**
     * 加密解密测试
     *
     * @param data 明文
     * @param key  密钥
     * @throws Exception
     */
    public static String Encrypt(String data, String key) throws Exception {
        byte[] dataBytes = data.getBytes();
        byte[] keyBytes  = key.getBytes();
        // 设置密钥及初始化向量（空白）
        IvParameterSpec iv = new IvParameterSpec(new byte[16]);
        SecretKey       k  = new SecretKeySpec(keyBytes, 0, keyBytes.length, "AES");
        // AES加密及BASE64编码
        Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
        c.init(Cipher.ENCRYPT_MODE, k, iv);
        byte[] encryptedBytes  = c.doFinal(dataBytes);
        String encryptedString = Base64.getEncoder().encodeToString(encryptedBytes);
        System.out.println(encryptedString);
        // AES加密及BASE64解码
        c = Cipher.getInstance("AES/CBC/PKCS5Padding");
        c.init(Cipher.DECRYPT_MODE, k, iv);
        String decryptedString = new String(c.doFinal(Base64.getDecoder().decode(encryptedString)));
        return decryptedString;
    }
}
