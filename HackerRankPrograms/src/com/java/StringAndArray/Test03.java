package com.java.StringAndArray;
import java.util.*;

public class Test03
{
 
  public static void main(String... args)
  {
    ArrayList alist = new ArrayList();
	ArrayList listStr = alist;
	ArrayList listBuf = alist;
	listStr.add(0, "Welcome");
	Object sb = listBuf.get(0);
	System.out.println(sb.toString());
  }
}