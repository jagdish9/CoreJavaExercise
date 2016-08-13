package com.java.StringAndArray;

import java.util.*;

class CityAndFlood {
    public static void main(String args[] ) throws Exception {
       Scanner scan = new Scanner(System.in);
       int N = scan.nextInt();
       int K = scan.nextInt();
       int c = 0;
       for(int i = 0; i < K; i++)
       {
       	 int I = scan.nextInt();
       	 //int J = scan.nextInt();
       	 for(int k = 1; k <= N; k++)
       	 {
       	 	if(I == k)
       	 	{
       	 		c++;
       	 	}
       	 }
       }
       System.out.println(N-c);
       scan.close();
    }
}