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
        String str = "{\\\"CURRENCY_SETTING\\\":\\\"null\\\",\\\"PURCHANAME\\\":\\\"LCC\\\",\\\"EXACT_SETTING\\\":\\\"{\\\\\\\"aduitleavemoney\\\\\\\":0.00,\\\\\\\"aduitleavepoint\\\\\\\":2.40,\\\\\\\"aduittaxaddmoeny\\\\\\\":0.00,\\\\\\\"allowlossmoney\\\\\\\":100.00,\\\\\\\"arrs\\\\\\\":\\\\\\\"SIN\\\\\\\",\\\\\\\"backdependdate\\\\\\\":1546012800000,\\\\\\\"backdepstartdate\\\\\\\":1530374400000,\\\\\\\"cabins\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"carrier\\\\\\\":\\\\\\\"TR\\\\\\\",\\\\\\\"childleavemoney\\\\\\\":0.00,\\\\\\\"childleavepoint\\\\\\\":2.50,\\\\\\\"childtaxaddmoney\\\\\\\":0.00,\\\\\\\"deps\\\\\\\":\\\\\\\"CAN\\\\\\\",\\\\\\\"excludearrs\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"excludedeps\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"flightnos\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"180529220920278436\\\\\\\",\\\\\\\"modifytime\\\\\\\":1527606707000,\\\\\\\"outticketremark\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"purchaseplatform\\\\\\\":\\\\\\\"1\\\\\\\",\\\\\\\"salesdayenable\\\\\\\":0,\\\\\\\"salesenddate\\\\\\\":1538236800000,\\\\\\\"salesendday\\\\\\\":0,\\\\\\\"salesplatform\\\\\\\":\\\\\\\"1\\\\\\\",\\\\\\\"salesstartdate\\\\\\\":1527523200000,\\\\\\\"salesstartday\\\\\\\":0,\\\\\\\"settingstatus\\\\\\\":0,\\\\\\\"startworktime\\\\\\\":-7200000,\\\\\\\"stopworktime\\\\\\\":57540000,\\\\\\\"todependdate\\\\\\\":1546012800000,\\\\\\\"todepstartdate\\\\\\\":1530374400000,\\\\\\\"voyagetype\\\\\\\":0}\\\",\\\"PURCHANAME_DATA\\\":\\\"GnyaJaYZ7wuQvG1DsFEY7tc8GB0lrrEJNYtQF9ssRaH8hTsneYCdDQH5ZI8yb6JyQyFv0Ymt3cjHrT/80JRUjqpARJpV1F3gBI/FVchAhqI9WqBoDOlkU18SKIVWrYUD72ZvKLYyl4K8kj26mTOcFsmCHdMg+vv/p5zcm5bhZ+zjnOk6sWar3b7Z3vGPSFKFZF+LhnJMS0AiGw+hyglI5f7wZLtR6KLsxOY50ez8jkL4uhvd0VMAetxvFVNLtBQuyV/OhXtJ03WYbyasVjLRHg==\\\"}\",\"publishPrice\":420,\"adultPrice\":431,\"adultTax\":92,\"childPublishPrice\":419,\"childPrice\":430,\"childTax\":0,\"infantPublishPrice\":0,\"infantPrice\":0,\"infantTax\":0,\"adultTaxType\":0,\"childTaxType\":0,\"priceType\":0,\"applyType\":0,\"exchange\":\"\",\"adultAgeRestriction\":null,\"eligibility\":\"NOR\",\"nationality\":null,\"forbiddenNationality\":null,\"planCategory\":0,\"invoiceType\":\"E\",\"minStay\":null,\"maxStay\":null,\"minPassengerCount\":0,\"maxPassengerCount\":0,\"bookingOfficeNo\":null,\"ticketingOfficeNo\":null,\"validatingCarrier\":null,\"reservationType\":\"OT\",\"productType\":\"PUB\",\"fareBasis\":null,\"airlineAncillaries\":null,\"rule\":null,\"fromSegments\":[{\"carrier\":\"TR\",\"depAirport\":\"CAN\",\"depTime\":\"201811250345\",\"arrAirport\":\"SIN\",\"arrTime\":\"201811250830\",\"stopAirports\":\"\",\"codeShare\":false,\"cabin\":\"O1\",\"aircraftCode\":\"789\",\"flightNumber\":\"107\",\"operatingCarrier\":\"\",\"operatingFlightNo\":\"107\",\"depTerminal\":\"1\",\"arrTerminal\":\"2\",\"cabinGrade\":null,\"duration\":0}],\"retSegments\":[]},{\"data\":\"{\\\"CURRENCY_SETTING\\\":\\\"null\\\",\\\"PURCHANAME\\\":\\\"LCC\\\",\\\"EXACT_SETTING\\\":\\\"{\\\\\\\"aduitleavemoney\\\\\\\":0.00,\\\\\\\"aduitleavepoint\\\\\\\":2.40,\\\\\\\"aduittaxaddmoeny\\\\\\\":0.00,\\\\\\\"allowlossmoney\\\\\\\":100.00,\\\\\\\"arrs\\\\\\\":\\\\\\\"SIN\\\\\\\",\\\\\\\"backdependdate\\\\\\\":1546012800000,\\\\\\\"backdepstartdate\\\\\\\":1530374400000,\\\\\\\"cabins\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"carrier\\\\\\\":\\\\\\\"TR\\\\\\\",\\\\\\\"childleavemoney\\\\\\\":0.00,\\\\\\\"childleavepoint\\\\\\\":2.50,\\\\\\\"childtaxaddmoney\\\\\\\":0.00,\\\\\\\"deps\\\\\\\":\\\\\\\"CAN\\\\\\\",\\\\\\\"excludearrs\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"excludedeps\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"flightnos\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"180529220920278436\\\\\\\",\\\\\\\"modifytime\\\\\\\":1527606707000,\\\\\\\"outticketremark\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"purchaseplatform\\\\\\\":\\\\\\\"1\\\\\\\",\\\\\\\"salesdayenable\\\\\\\":0,\\\\\\\"salesenddate\\\\\\\":1538236800000,\\\\\\\"salesendday\\\\\\\":0,\\\\\\\"salesplatform\\\\\\\":\\\\\\\"1\\\\\\\",\\\\\\\"salesstartdate\\\\\\\":1527523200000,\\\\\\\"salesstartday\\\\\\\":0,\\\\\\\"settingstatus\\\\\\\":0,\\\\\\\"startworktime\\\\\\\":-7200000,\\\\\\\"stopworktime\\\\\\\":57540000,\\\\\\\"todependdate\\\\\\\":1546012800000,\\\\\\\"todepstartdate\\\\\\\":1530374400000,\\\\\\\"voyagetype\\\\\\\":0}\\\",\\\"PURCHANAME_DATA\\\":\\\"GnyaJaYZ7wuQvG1DsFEY7tc8GB0lrrEJNYtQF9ssRaH8hTsneYCdDQH5ZI8yb6JyQyFv0Ymt3cjHrT/80JRUjmvxlcG6k09V8KkK/CDfiRrMLJ3aOfFRSHdjZ+AxnzQAaTOIvx6oRBrt6HE7lAmAHaQsvxT5NoMOi0KBwiAFSgS2Yx7bzlWkBm3rMM+d2pnQ4CqGlRxC6W7cGIS/v69SKuO7mXjG6AX8VQiqDMzED0N0w5URrAXajkNqGrrcRZI7q2YZ6DZ15ckZfeb3ntwXJQ==\\\"}";
        try {
            String compressStr = rDataCompress(str);
            System.out.println(compressStr);
            System.out.println(rDataUnCompress(compressStr));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
