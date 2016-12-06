package com.java.edgeverve;

import java.util.Scanner;

public class Test01 {
		 public static void main(String args[] ) throws Exception {
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		        Scanner scan = new Scanner(System.in);
		        int no = scan.nextInt();
		        int prime = 1;
		        int mul = 2;
		        while(no != prime)
		            {
		            int c = 0;
		            for(int i = 2; i < mul; i++)
		                {
		                   if(mul%i == 0)
		                       {
		                         c++;
		                       }
		                }
		            if(c == 0)
		                {
		                 prime = prime * mul;
		                System.out.print(mul+" ");
		            }
		            mul++;
		        }
		        scan.close();
	}

}
