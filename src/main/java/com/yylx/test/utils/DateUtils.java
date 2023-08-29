package com.yylx.test.utils;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DateUtils {

    private static final DateTimeFormatter DATE_FORMATTER;
    public static final String FORMATTER_DATE = "yyyy-MM-dd";
    private static final Map<String, DateTimeFormatter> FORMATTER_MAP = new HashMap<>();

    static {
        DATE_FORMATTER = DateTimeFormat.forPattern(FORMATTER_DATE);
        FORMATTER_MAP.put(FORMATTER_DATE, DATE_FORMATTER);
    }

    private DateUtils() {

    }

    public static Date converterDate(String time, String pattern) {
        if (StringUtils.isEmpty(time)) {
            return null;
        }
        return FORMATTER_MAP.get(pattern).parseDateTime(time).toDate();
    }

    public static String convertDateString(Date date, String pattern) {
        return new DateTime(date).toString(pattern);
    }
}
