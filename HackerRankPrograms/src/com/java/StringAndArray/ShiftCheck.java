
package com.java.StringAndArray;
import java.io.*;
import java.util.*;

public class ShiftCheck {

    
    public static void insertionSortPart2(int[] ar)
    {       
           // Fill up the code for the required logic here
           // Manipulate the array as required
           // The code for Input/Output is already provided
        int n = ar.length;
        int s = n - 1;
        int temp = 0, c = 0;
        for(int i = 0; i < s; i++)
            {
               for(int j = 0; j <= i; j++)
                   {              
                     if(ar[i+1] < ar[j])
                         { 
                           temp = ar[i+1];
                           ar[i+1] = ar[j];
                           ar[j] = temp;
                           c = c+1;
                         }
                   }
            }
        printShiftNumber(c);
		printArray(ar);
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
	
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
   
    private static void printShiftNumber(int c)
        {
         System.out.println(c);
        }
}