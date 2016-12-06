package com.java.edgeverve;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 2; i <= n; i++) 
        {  
               while (n % i == 0) 
               {  
                System.out.print(i+" "); 
                n = n / i;  
                 }  
        }
        scan.close();
	}

}

//passed successfully all test cases