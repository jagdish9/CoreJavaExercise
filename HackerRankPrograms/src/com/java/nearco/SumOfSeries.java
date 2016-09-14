package com.java.nearco;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
			int j = 1;
			float sum = 0;
			while(j <= N)
			{
				int k = j;
				float l = 1;
				while(k >= 1)
				{
					l = l*1/k;
					k--;
				}
				sum = sum + l;
				j++;
			}
			System.out.println(sum);
		scan.close();
	}

}
