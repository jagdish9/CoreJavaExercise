package com.java.rank.map;

import java.util.Scanner;

public class RIT21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < T; i++)
		{
			int N = scan.nextInt();
			boolean flag = false;
			if(N % 21 == 0)
			{
				flag = true;
			}

			boolean flag_1 = false;
			String str = String.valueOf(N);
			int len = str.length();
			for(int j = 0; j < len-1; j++)
			{
				String subString = str.substring(j, j+2);
				if(subString.equals("21"))
				{
					flag_1 = true;
				}
			}
			
			if(flag || flag_1)
			{
				System.out.println("The streak is broken!");
			}
			else
			{
				System.out.println("The streak lives still in our heart!");
			}
		}
		scan.close();
	}

}
