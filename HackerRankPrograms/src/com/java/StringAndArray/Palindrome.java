package com.java.StringAndArray;


import java.util.*;
public class Palindrome
{

 private static boolean ispalindrome(char[] ch)
 {
    int i = 0;
	int j = ch.length - 1;
	int no = 0;
	while(j > i)
	{
	  if(ch[i] != ch[j])
	    {
		 return false;
		}
		++i;
		--j;
	}
	
	return true;
 }
 public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter any string to check palindrome or not");
	String strng = scan.nextLine();
	
	char[] ch = strng.toCharArray();
	boolean check =  ispalindrome(ch);
	if(check)
	{
	 System.out.println("String is palindrome");
	}
	else
	{
	  System.out.println("String is not palindrome");
	}
	
  }
}