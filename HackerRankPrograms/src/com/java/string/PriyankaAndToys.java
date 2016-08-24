package com.java.string;

import java.util.Arrays;
import java.util.Scanner;

public class PriyankaAndToys {

	  public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scan = new Scanner(System.in);
	        int N = scan.nextInt(); 
	        int weights[] = new int[N];
	        for(int i = 0; i < N; i++)
	            {
	            weights[i] = scan.nextInt();
	        }
	        Arrays.sort(weights);
	        int extra = weights[0];
	        int unit = 1;
	        for(int j = 0; j < N; j++)
	            {
	            if(weights[j] > extra+4)
	                {
	                unit++;
	                extra = weights[j];
	            }
	        }
	        System.out.println(unit);
	        scan.close();
	    }
}
