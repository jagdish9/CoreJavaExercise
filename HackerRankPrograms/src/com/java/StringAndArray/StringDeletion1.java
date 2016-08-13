package com.java.StringAndArray;
import java.util.Scanner;
import java.util.ArrayList;

public class StringDeletion1
{
  public static void main(String args[])
  {
    ArrayList<String> alist = new ArrayList<String>();
    Scanner scan = new Scanner(System.in);
	System.out.println("Enter no. of test cases");
	int nt = scan.nextInt();
	System.out.println("Enter "+nt+" test cases in string format");
	for(int i = 1; i <= nt; i++)
	{
	  alist.add(scan.nextLine());
	}
	
	for(String str : alist)
	{
	  
	}
  }
}