package com.java.StringAndArray;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateHours2 {
   public static void main(String [] args) throws Exception {
    /*   SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
       SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ss a");
       Date date = parseFormat.parse("10:30:25 PM");
       System.out.println(parseFormat.format(date) + " = " + displayFormat.format(date)); */
	   
	   DateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
	   DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter date in HH:MM:SS PM hours format");
	   String line = scan.nextLine();
	   Date dt = df.parse(line);
	   System.out.println(line + " = " + displayFormat.format(dt));
	   scan.close();
	   
   }
}