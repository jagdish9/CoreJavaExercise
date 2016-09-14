package com.java.onlystring;

import java.util.Scanner;

public class SubStringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt();
	      scan.nextLine();
	      String[] str = new String[n];
	      for(int i = 0; i < n; i++)
	      {
	      	 str[i] = scan.nextLine();
	      }
	      
	      int q = scan.nextInt();
	      for(int j = 0; j < q; j++)
	      {
	      	int c = 0;
	      	int L = scan.nextInt();
	      	int R = scan.nextInt();
	      	String subStr = scan.nextLine();
	      	for(int k = 0; k < n; k++)
	      	{
	      	  int x = 0;
	      	  int y = x+1;
	      	  int ln = str[k].length();
	      	  while(x <= ln)
	      	  {
	      	  while(y <= ln)
	      	   {
	      		 // System.out.println(str[k].substring(x, y));
	      		  String comp = str[k].substring(x, y);
	      		if(comp.equalsIgnoreCase(subStr.trim()))
	      		 {
	      			c++;
	      			
	      		 }
	      		y++;
	      		/*else
	      		 {
	      			y++;
	      		 } */
	      	   }
	      	   x++;
	      	  }
	      	}
	      	System.out.println(c);
	      }
	      scan.close();
	}

}
