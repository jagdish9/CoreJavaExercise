package com.java.edgeverve;

import java.util.ArrayList;
import java.util.List;

public class Test03 {

	public static List<Integer> primeFactors(int number) {  
		 int n = number;  
		 List<Integer> primeFactors = new ArrayList<Integer>();  
		 for (int i = 2; i <= n/i; i++) {  
		  while (n % i == 0) {  
		   primeFactors.add(i);  
		   n /= i;  
		  }  
		 }  
		 if(n>1)  
		  primeFactors.add(n);  
		 return primeFactors;  
		}   
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	}

}
