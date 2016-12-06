package com.java.expectation;

import java.util.Scanner;

public class AtoZ {

	
	private static boolean checkAtoZ(String input)
	{
	  boolean matches = true;
       for (char ch = 'a'; ch <= 'z'; ch++){
        if (!input.toLowerCase().contains(String.valueOf(ch))){
            matches = false;
        }
    }
    return matches;
	}
	
    public static void main(String args[] ) throws Exception {
       
       Scanner scan = new Scanner(System.in);
       int T = scan.nextInt();
       scan.nextLine();
       for(int i = 0; i < T; i++)
       {
       	 String str = scan.nextLine().trim();
       	 boolean flag = false;
       	 flag = checkAtoZ(str);
       	 if(flag)
       	 {
       	 	System.out.println("YES");
       	 }
       	 else
       	 {
       	 	System.out.println("NO");
       	 }
       }
       scan.close();
    }

}
