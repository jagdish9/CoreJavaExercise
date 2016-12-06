package com.java.basic;

import java.util.Scanner;

public class SamuShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i = 0; i < T; i++)
		{
			int N = scan.nextInt();	
			String[] str = new String[N];
			for(int j = 0; j < N; j++)
			{
				str[j] = scan.next();
				str[j] = str[j] + " " +scan.next();
				str[j] = str[j] + " " +scan.next();
				System.out.println();
			}
			
			int sum = 0;
			for(int k = 0; k < str.length; k++)
			{
				String[] getVal = str[k].split(" ");
				int min = Integer.parseInt(getVal[0]);
				for(int l = 0; l < getVal.length; l++)
				{
					if(Integer.parseInt(getVal[l]) < min)
					{
						min = Integer.parseInt(getVal[l]);
					}
				}
				sum = sum+min;
			}
			System.out.println(sum);
		}
		scan.close();
	}

}
