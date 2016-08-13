package com.java.StringAndArray;
import java.util.*;

class Test04
{
  private String str;
  
  Test04(String str)
  {
    this.str = str;
  }
  
  public String toString()
  {
   return str;
  }
}

public class CollClient
{
  @SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String... args)
  {
    HashSet hm = new HashSet();
	String s1 = new String("das");
	String s2 = new String("das");
	
	Test04 s3 = new Test04("abcdef");
	Test04 s4 = new Test04("abcdef");
	
	hm.add(s1);
	hm.add(s2);
	hm.add(s3);
	hm.add(s4);
	
	System.out.println(hm);
  }
}