package com.kq.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    /**
     * 获取指定year的日期
     * @param year
     * @return
     */
    public static Date getDate(int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,year);

        return cal.getTime();
    }

}
