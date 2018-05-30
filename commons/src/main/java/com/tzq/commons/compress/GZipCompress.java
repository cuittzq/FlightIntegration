package com.tzq.commons.compress;

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

    public static String rDataCompress(String data) throws IOException {
        if (StringUtils.isBlank(data)) {
            return StringUtils.EMPTY;
        }
        byte[] dataByte = data.getBytes();
        byte[] comData = compress(dataByte);

        return Base64.encodeBase64String(comData);
    }

    public static String rDataUnCompress(String data) throws IOException {
        if (StringUtils.isBlank(data)) {
            return StringUtils.EMPTY;
        }

        byte[] dataByte = Base64.decodeBase64(data);
        byte[] umByte = umCompress(dataByte);

        return  new String(umByte);
    }

    public static void main(String[] args) {
        String str = "asdfdadsffasasdfffffffffffffffffffffdddddddddddddddddddddddddddddddd";
        try {
            String compressStr = rDataCompress(str);
            System.out.println(compressStr);
            System.out.println(rDataUnCompress(compressStr));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
