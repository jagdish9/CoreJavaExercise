package com.java.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GettingCurrentDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateFormat df = new SimpleDateFormat("dd-MMM-yy HH:mm:ss");
		Date date = new Date();
		System.out.println(df.format(date));
		
		Calendar calObj = Calendar.getInstance();
		System.out.println(df.format(calObj.getTime()));
	}

}
