package com.java.StringAndArray;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TimeConversion {

	public static void main(String[] args) {
		String time = "07:05:45PM";
		DateFormat inFormat = new SimpleDateFormat( "hh:mm:ssaa");
		DateFormat outFormat = new SimpleDateFormat( "HH:mm:ss");

		Date date = null;
		try {
			date = inFormat.parse(time); 
		}catch (ParseException e ){
			e.printStackTrace();
		}
		if( date != null ){
			String myDate = outFormat.format(date);
			System.out.println(myDate);
		}
	}

}