package com.tzq.commons.compress;

import com.tzq.commons.utils.AESUtil;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by cl24957 on 2018/5/30.
 */
public class GZipCompress {

    private static final int BUFFER_SIZE = 256;

    private static final String COMPRESS_AES_KEY="9859832798641320";

    /**
     * gzip压缩
     *
     * @param array
     * @return
     * @throws IOException
     */
    public static byte[] compress(byte[] array) throws IOException {
        if (array == null) {
            return null;
        }

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try (GZIPOutputStream gzip = new GZIPOutputStream(out)) {
            gzip.write(array);
        }

        return out.toByteArray();
    }

    /**
     * 解压
     *
     * @param array
     * @return
     * @throws IOException
     */
    public static byte[] umCompress(byte[] array) throws IOException {
        if (array == null) {
            return null;
        }

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ByteArrayInputStream in = new ByteArrayInputStream(array);

        try (GZIPInputStream gzip = new GZIPInputStream(in)) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int n;
            while ((n = gzip.read(buffer)) >= 0) {
                out.write(buffer, 0, n);
            }
        }

        return out.toByteArray();
    }

    public static String rDataCompress(String data) throws Exception {

        //1.压缩第一次
        if (StringUtils.isBlank(data)) {
            return StringUtils.EMPTY;
        }
        byte[] dataByte = data.getBytes();
        byte[] comData = compress(dataByte);

        //2.解析结果
        String result = Base64.encodeBase64String(comData);

        //3.加密
        return AESUtil.Encrypt(result,COMPRESS_AES_KEY);
    }


    public static String rDataUnCompress(String data) throws Exception {
        if (StringUtils.isBlank(data)) {
            return StringUtils.EMPTY;
        }

        String   result = AESUtil.Decrypt(data,COMPRESS_AES_KEY);

        byte[]  dataByte=  Base64.decodeBase64(result);
        byte[]  umByte = umCompress(dataByte);

        return  new String(umByte);
    }

//    private static String byte2HexString(byte[] bytes)
//    {
//        StringBuffer buffer = new StringBuffer();
//        for (int i = 0; i < bytes.length; ++i){
//
//            String s = Integer.toHexString(bytes[i] & 0xFF);
//            if (s.length() == 1){
//                s= "0" + s;
//            }
//
//            buffer.append(s);
//        }
//
//        return buffer.toString();
//    }
//
//    private static byte[] hexString2Byte(String str)
//    {
//        int len = (str.length() / 2);
//        byte[] result = new byte[len];
//        char[] achar = str.toCharArray();
//        for (int i = 0; i < len; i++) {
//            int pos = i * 2;
//            result[i] = (byte) (toByte(achar[pos]) << 4 | toByte(achar[pos + 1]));
//        }
//
//        return result;
//    }
//
//    private static int  toByte(char c) {
//        byte b = (byte) "0123456789ABCDEF".indexOf(c);
//        return b;
//    }

    public static void main(String[] args) {
        String str = "GnyaJaYZ7wuQvG1DsFEY7tc8GB0lrrEJNYtQF9ssRaGOKRvE+9e8faEpKyLD07VCryOix5hECzt7dJW7657DwgZnGxwubse4vlDP+7gJEsa29l4fz3SoSVWzg8RcUfQ2W+My2YfkAWAY6VSDOyQg2y8AysgsV7sI/WjotSEHsZjL/onxZo3eCT+pCS5Xz0LwYrkPHlgmcbNXi31Oi0G0tCN+XGB2YzTta97xvaZVBVZKDIfewf5uuizU7bbT/GWEDRBdIVc7noCs0TnECQ4yPA==";
        try {
            String compressStr = rDataCompress(str);
            System.out.println(compressStr);
            System.out.println(rDataUnCompress(str));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
