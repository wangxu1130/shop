package com.fh.api.admin.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static final String Y_M_D = "yyyy-MM-dd";

    public static final String YMD_HMS ="yyyy-MM-dd HH:mm:ss";
    
    public static String convertDate2Str(Date date, String pattern ){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }
    public static Date  convertDate2Date(String str, String pattern){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        try {
            return simpleDateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
