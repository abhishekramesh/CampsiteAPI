package io.java.upgrade.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	public static Date addDaysToDate(Date startDate, Integer defaultNumberOfDays) {
		
		System.out.println(dateFormat.format(startDate));
        Calendar c = Calendar.getInstance();
        c.setTime(startDate);
        c.add(Calendar.DATE, defaultNumberOfDays);
        Date endDate = c.getTime();
        System.out.println(dateFormat.format(endDate));
        return endDate;
	}
}
