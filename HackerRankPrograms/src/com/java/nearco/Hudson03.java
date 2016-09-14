package com.java.nearco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Hudson03 {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    String line = br.readLine();
	        int T = Integer.parseInt(line);
	        
	        for(int i = 0; i < T; i++)
			{
	        	String[] str = br.readLine().split(",");
	        	int l = 0;
			    String myTime = "11:00";
				SimpleDateFormat df = new SimpleDateFormat("HH:mm");
				 Date d = df.parse(myTime); 
				 Calendar cal = Calendar.getInstance();
				 cal.setTime(d);
				 
				int trainSpeed = Integer.parseInt(str[l]);
				int sherlockSpeed = Integer.parseInt(str[l+1]);
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
	        br.close();
	}

}
