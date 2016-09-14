package com.java.nearco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Hudson01 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		 String myTime = "12:00";
		 SimpleDateFormat df = new SimpleDateFormat("HH:mm");
		 Date d = df.parse(myTime); 
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(d);
		 cal.add(Calendar.MINUTE, 30);
		 String newTime = df.format(cal.getTime());
		 System.out.println(newTime);
		 
	}

}
