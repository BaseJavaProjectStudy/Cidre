package com.git.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 日期类型工具类
 * @author andy
 *
 */
public class DateFormatUtil {
public static  String getDate(){
	Date date = new Date();
	DateFormat dateInstance = SimpleDateFormat.getDateInstance();
	String format = dateInstance.format(date);
	return format;
	
}
public static void main(String[] args) {
	String date = getDate();
	System.out.println(date);
	
}
}
