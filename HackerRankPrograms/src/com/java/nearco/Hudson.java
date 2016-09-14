package com.java.nearco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Hudson {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		 
		for(int i = 0; i < T; i++)
		{
		   String myTime = "11:00";
			SimpleDateFormat df = new SimpleDateFormat("HH:mm");
			 Date d = df.parse(myTime); 
			 Calendar cal = Calendar.getInstance();
			 cal.setTime(d);
			 
			int trainSpeed = scan.nextInt();
			int sherlockSpeed = scan.nextInt();
			int x = trainSpeed;
			int y = sherlockSpeed;
			int z = 0;
			while(trainSpeed != z)
			{
					trainSpeed = trainSpeed + x * 1/2;
					sherlockSpeed = z + y * 1/2;
					z = sherlockSpeed;
					cal.add(Calendar.MINUTE, 30);
			}
			
			String newTime = df.format(cal.getTime());
			System.out.println(newTime);
		}
		scan.close();
		
	}

}
