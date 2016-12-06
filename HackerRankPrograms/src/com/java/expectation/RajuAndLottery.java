package com.java.expectation;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RajuAndLottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	       Scanner scan = new Scanner(System.in);
	       int T = scan.nextInt();
	       scan.nextLine();
	       for(int i = 0; i < T; i++)
	       {
	       	 int N = scan.nextInt();
	       	 scan.nextLine();
	       	 int[][] arr = new int[N][N];
	       	 for(int j = 0; j < N; j++)
	       	 {
	       	 	for(int k = 0; k < 3; k++)
	       	 	{
	       	 		 arr[j][k] = scan.nextInt();
	       	 	}
	       	 }
	       	 double value = 0.00;
	       	 int c = 0;
	       	 for(int l = 1; l < N; l++)
	       	 {
	       	 	for(int t = 0; t < N-1; t++)
	       	 	{
	       	 		if(arr[l][0] == arr[t][1])
	       	 		{
	       	 		 value = value + arr[t][2];
	       	 		 c++;
	       	 		}
	       	 	}
	       	 }
	       	 if(c == N-1)
	       	 {
	       	 	value = value + arr[N-1][N-2];
	       	 }
	       	 DecimalFormat df2 = new DecimalFormat("#.00");
	       	 System.out.println(df2.format(value/100.00));
	       }
	       scan.close();
	}

}
