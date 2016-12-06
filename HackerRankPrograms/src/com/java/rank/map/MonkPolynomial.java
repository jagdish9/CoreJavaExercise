package com.java.rank.map;

/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.Scanner;

class MonkPolynomial {
    public static void main(String args[] ) throws Exception {
       
       Scanner scan = new Scanner(System.in);
       int T = scan.nextInt();
       scan.nextLine();
       for(int i = 0; i < T; i++)
       {
       	 int A = scan.nextInt();
         int B = scan.nextInt();
         int C = scan.nextInt();
         int K = scan.nextInt();
         boolean flag = true;
         int x = -1;
         while(flag)
         {
        	 x++;
         	if(A*x*x + B*x + C >= K)
         	{
         		flag = false;
         	}
         }
         System.out.println(x);
       }
       scan.close();
    }
}

