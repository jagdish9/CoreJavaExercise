package com.java.StringAndArray;
import java.util.Scanner;


public class FunnyString
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
	System.out.println("Enter no. of test cases");
	int notstcases = scan.nextInt();
	int round = 0;
	int rev1 = 0, rev0 = 0, ch1 = 0, ch0 = 0, total0 = 0, total1 = 0;
	for(int i = 0; i < notstcases; i++)
	 {
	   round = 0;
	   System.out.println("Enter String");
       String strng = scan.next();
	   char[] ch = strng.toCharArray();
	   char[] rev = new char[strng.length()];
	   int len = strng.length();
	   int k = 0;
	   for(int j = len - 1; j >= 0; j--)
	    { 
		   System.out.print("ch: "+ch[j]+" ");
		   rev[k] = ch[j];
		   System.out.print("rev: "+rev[k]+" ");
		   k = k+1;
		}
		
		for(int t = 0; t < len - 1; t++)
		{ 
		     rev1 = (int)rev[t+1];
			 rev0 = (int)rev[t];
			 ch1 = (int)ch[t+1];
			 ch0 = (int)ch[t];
			 total1 = rev1 - rev0;
			 total0 = ch1 - ch0;

		  if(Math.abs(total1) == Math.abs(total0))
		   { 
		     round = round + 1;
		   }
		}
		 if(round == strng.length()- 1)
		 {
		   System.out.println("Funny");
		 }
		 else
		 {
		   System.out.println("Not Funny");
		 }
		 
		 }
	scan.close();
	 }
  }


/*acxz
zxca 
0 1
1 2
2 4
3 7

0 1
1 2
2 3
3 4 */

