package com.java.StringAndArray;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHours {
  public static void main(String[] argv) throws Exception {

    Date date = new Date();
    SimpleDateFormat simpDate;

    simpDate = new SimpleDateFormat("kk:mm:ss");
    System.out.println(simpDate.format(date));

  }
}










