package com.java.hacker.earth;

import java.util.Scanner;

public class BearAndVowels {

	public static boolean isVowel(char ch)
    { 
      String vowels = "aeiouy"; 
      char ch2; 
       for (int i=0; i<vowels.length(); i++) 
        { 
          ch2 = vowels.charAt(i); 
           if (ch != ch2) 
            { 
             return true; 
            } 
        }  
      return false; 
    } 
    
public static void main(String args[] ) throws Exception {
    
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    for(int i = 0; i < T; i++)
    {
    	String str = scan.next();
    	int len = str.length();
    	char ch1;
    	int vow = 0, cons = 0, conse = 0;
    	for(int j = 0; j < len; j++)
    	{
    		ch1 = str.charAt(j);
    		if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' 
    		|| ch1 == 'u' || ch1 == 'y')
    		 {
    			vow++;
    		 }
    		else
    		 {
    			cons++;
    		 }
    	}
    	for(int j = 0; j < len - 1; j++)
    	{
    		int k = j;
    		  if(isVowel(str.charAt(k)) && isVowel(str.charAt(k+1)))
    		  {
    		  	conse++;
    		  }
    	}
    	System.out.println(conse);
    	if(cons > vow || conse == 2)
    	{
    		System.out.println("hard");
    	}
    	else
    	{
    		System.out.println("easy");
    	}
    }
    
    scan.close();
 }
}
