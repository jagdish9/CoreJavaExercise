package com.java.test.cisco;

import java.util.Scanner;

public class EncodedString {


	  private static int[] frequency(String s)
		{
	       int len = s.length();
		   int[] alpha = new int[26];
		   String srn = "";
		   for(int i = 0; i < len - 2; i++)
		   {
		     String str2 = null;
		     int t = i;
		     //System.out.print(String.valueOf(s.charAt(t+2))+" ");
		     if(String.valueOf(s.charAt(t+2)).equals("#"))
			 {
			   String str = s.substring(i, t+2);
			   int val = Integer.parseInt(str);
			   str2 = getCharForNumber(val);
			   i = i+2;
			 }
		     else if(String.valueOf(s.charAt(t)).equals("(") && String.valueOf(s.charAt(t+2)).equals(")"))
			 {
	 		    if(String.valueOf(s.charAt(t-1)).equals("#"))
	            {
	                String str3 = s.substring(t-3, t-2);
					int val3 = Integer.parseInt(str3);
			        str2 = getCharForNumber(val3);
	            }
				else
				{
				   str2 = getCharForNumber(Integer.parseInt(String.valueOf(s.charAt(t-1))));
				}
	 		    i = i+2;
			 }
			 else
			 {
			   str2 = getCharForNumber(Integer.parseInt(String.valueOf(s.charAt(i))));
			 }
			srn = srn+str2;
		   }
		   
		   int l = 0;
		   for(int val = 65; val <= 90; val++)
	       {
		    int lent = srn.length();
			boolean flag = false;
			for(int j = 0; j < lent; j++)
			{
			  if(String.valueOf(srn.charAt(j)).equals(String.valueOf((char)val)))
			  {
			    flag = true;
			  }
			}
	        if(flag)
	        {
	          alpha[l] = 1;
	        }
	        else
	        {
	          alpha[l] = 0;
	        }
			l++;
	      }
	      return alpha;
	    }
		
		private static String getCharForNumber(int i)
		{
	      return i > 0 && i < 27 ? String.valueOf((char)(i + 64)) : null;
	    }
		
		
	    public static void main(String args[] ) throws Exception
		{
		  Scanner scan = new Scanner(System.in);
		  String str = scan.nextLine().trim();
		  int[] alpha = frequency(str);
		  for(int val = 0; val < alpha.length; val++)
	       {
		     System.out.print(alpha[val]+" ");
		   }
		  scan.close();
		}
}
