package com.tzq.biz.utils.security;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * 功能描述：
 *
 * @author Tanzhiqiang
 **/
public class AES {

    /**
     * 私钥key
     */
    private static final String key = "1234567812345678";

    /**
     * 初始化向量iv
     */
    private static final String iv = "1234567812345678";


    private static final String DES3 = "DESede";
    private static final String DES = "DES";


    /**
     * AES加密
     *
     * @param data 待加密数据
     * @return 加密后的数据
     * @throws Exception
     */
    public static String encrypt(String data) throws Exception {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            int blockSize = cipher.getBlockSize();
            byte[] dataBytes = data.getBytes();
            int plaintextLength = dataBytes.length;
            if (plaintextLength % blockSize != 0) {
                plaintextLength = plaintextLength + (blockSize - (plaintextLength % blockSize));
            }
            byte[] plaintext = new byte[plaintextLength];
            System.arraycopy(dataBytes, 0, plaintext, 0, dataBytes.length);
            SecretKeySpec keyspec = new SecretKeySpec(key.getBytes(), "AES");
            IvParameterSpec ivspec = new IvParameterSpec(iv.getBytes());
            cipher.init(Cipher.ENCRYPT_MODE, keyspec, ivspec);
            byte[] encrypted = cipher.doFinal(plaintext);
            return new sun.misc.BASE64Encoder().encode(encrypted);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 解密数据
     *
     * @param data 待解密数据
     * @return 解密后的数据
     * @throws Exception
     */
    public static String desEncrypt(String data) throws Exception {
        try {
            byte[] encrypted1 = new sun.misc.BASE64Decoder().decodeBuffer(data);
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            SecretKeySpec keyspec = new SecretKeySpec(key.getBytes(), "AES");
            IvParameterSpec ivspec = new IvParameterSpec(iv.getBytes());
            cipher.init(Cipher.DECRYPT_MODE, keyspec, ivspec);
            byte[] original = cipher.doFinal(encrypted1);
            String originalString = new String(original);
            return originalString;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 生成24字节的3DES密钥。
     * （不够24字节，则补0；超过24字节，则取前24字节。）
     * @param key 密钥字符串
     * @return
     */
    public static byte[] get3DesKey(String key) {
        byte[] keyBytes = new byte[24];
        if(key.getBytes().length > 24) {
            for(int i = 0;i<24;i++) {
                keyBytes[i] = key.getBytes()[i];
            }
        } else {
            for(int i = 0;i<24;i++) {
                if(i < key.getBytes().length) {
                    keyBytes[i] = key.getBytes()[i];
                } else {
                    keyBytes[i] = 0x00;
                }
            }
        }
        return keyBytes;
    }

    /**
     * 生成8字节的DES密钥。
     * （不够8字节，则补0；超过8字节，则取前8字节。）
     * @param key 密钥字符串
     * @return
     */
    public static byte[] getDesKey(String key) {
        byte[] keyBytes = new byte[8];
        if(key.getBytes().length > 8) {
            for(int i = 0;i<8;i++) {
                keyBytes[i] = key.getBytes()[i];
            }
        } else {
            for(int i = 0;i<8;i++) {
                if(i < key.getBytes().length) {
                    keyBytes[i] = key.getBytes()[i];
                } else {
                    keyBytes[i] = 0x00;
                }
            }
        }
        return keyBytes;
    }



    /**
     * 3DES加密
     * @param
     *      key ：加密密钥
     *      value   ：被加密的数据
     * @return
     *      加密后的数据
     */
    public static String encrypt3DES(byte[] key, byte[] value) {
        byte[] retValue = null;
        try {
            SecretKey deskey = new SecretKeySpec(key, DES3);
            Cipher c1 = Cipher.getInstance(DES3);
            c1.init(1, deskey);
            retValue = c1.doFinal(value);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        //转换为16进制数返回
        return getHexString(retValue);
    }

    /**
     * 3DES解密
     * @param
     *      key ：解密密钥
     *      value   ：被解密的数据
     * @return
     *      解密后的明文数据
     */
    public static String decrypt3DES(byte[] key, byte[] value) {
        byte[] retValue = null;
        try {
            SecretKey deskey = new SecretKeySpec(key, DES3);
            Cipher c1 = Cipher.getInstance(DES3);
            c1.init(2, deskey);
            retValue = c1.doFinal(value);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new String(retValue);
    }

    /**
     * DES加密
     * @param
     *      key ：加密密钥
     *      value   ：被加密的数据
     * @return
     *      加密后的数据
     */
    public static String encryptDES(byte[] key, byte[] value) {
        byte[] retValue = null;
        try {
            SecretKey deskey = new SecretKeySpec(key, DES);
            Cipher c1 = Cipher.getInstance(DES);
            c1.init(1, deskey);
            retValue = c1.doFinal(value);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        //转换为16进制数返回
        return getHexString(retValue);
    }

    /**
     * DES解密
     * @param
     *      key ：解密密钥
     *      value   ：被加密的数据
     * @return
     *      加解密后的明文数据
     */
    public static String decryptDES(byte[] key, byte[] value) {
        byte[] retValue = null;
        try {
            SecretKey deskey = new SecretKeySpec(key, DES);
            Cipher    c1     = Cipher.getInstance(DES);
            c1.init(2, deskey);
            retValue = c1.doFinal(value);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new String(retValue);
    }

    /*
     * 转换为16进制数
     * @param data
     * @return
     *      16进制数
     */
    public static String getHexString(byte[] data) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; ++i) {
            String ch = Integer.toHexString(data[i] & 0xFF).toUpperCase();
            if (ch.length() == 2)
                sb.append(ch);
            else
                sb.append("0").append(ch);
        }
        return sb.toString();
    }

    /**
     * 将16进制的字符串转换为byte数组
     * @param hexString
     * @return
     */
    public static byte[] hexStringToBytes(String hexString) {
        if (hexString == null || hexString.equals("")) {
            return null;
        }
        hexString = hexString.toUpperCase();
        int length = hexString.length() / 2;
        char[] hexChars = hexString.toCharArray();
        byte[] d = new byte[length];
        for (int i = 0; i < length; i++) {
            int pos = i * 2;
            d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
        }
        return d;
    }

    public static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }


}
