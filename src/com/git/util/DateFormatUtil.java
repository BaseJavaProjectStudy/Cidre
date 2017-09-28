package com.git.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * �������͹�����
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
	String date = getDateSecond();
	System.out.println(date);
	
}
public static String getDateSecond(){
	Date date = new Date();
	DateFormat dateFormat = DateFormat.getInstance();
	return dateFormat.format(date);
}
}
