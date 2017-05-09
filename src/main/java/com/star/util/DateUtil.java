package com.star.util;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hp on 2017/4/8.
 */
@Component
public class DateUtil {
    public static String currentTime(){
        SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd HH:mm");
        return format.format(new Date());
    }
}
