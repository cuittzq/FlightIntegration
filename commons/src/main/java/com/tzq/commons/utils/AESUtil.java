package com.tzq.commons.utils;

import sun.misc.BASE64Decoder;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/8
 * LTC.COM.
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
        return encryptedString;
    }

    /**
     *  aes解密
     * @param data 解密data
     * @param aesKey ase秘钥
     * @return
     * @throws Exception
     */
    public static String Decrypt(String data,String aesKey) throws  Exception{
        byte[] byteMi = new BASE64Decoder().decodeBuffer(data);
        IvParameterSpec zeroIv = new IvParameterSpec(new byte[16]);
        SecretKeySpec key = new SecretKeySpec(
                aesKey.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        //与加密时不同MODE:Cipher.DECRYPT_MODE
        cipher.init(Cipher.DECRYPT_MODE, key,zeroIv);  //CBC类型的可以在第三个参数传递偏移量zeroIv,ECB没有偏移量
        byte[] decryptedData = cipher.doFinal(byteMi);
        return new String(decryptedData, "UTF-8");
    }

    public static void main(String[] args) {
        String asrKey = "9859832798641329";
        String data = "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";

        try {
            String res = Decrypt(data,asrKey);
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("完毕");
    }
}
