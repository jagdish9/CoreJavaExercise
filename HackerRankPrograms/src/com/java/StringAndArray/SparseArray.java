package com.java.StringAndArray;
import java.io.*;
import java.util.*;

public class SparseArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan =  new Scanner(System.in);
        int notstcases = scan.nextInt();
        List<String> str= new ArrayList<String>();
        int count = 0;
        for(int i = 0; i < notstcases; i++)
            {
              str.add(scan.next());  
           }
        
        int noOfQueries = scan.nextInt();
        List<String> str1= new ArrayList<String>();
        
        for(int i = 0; i < noOfQueries; i++)
            {
              str1.add(scan.next());  
           }
        
          Iterator<String> ls = str.iterator();
          Iterator<String> ls1 = str1.iterator();
             
           while(ls1.hasNext())
               {
                 count = 0;
                 String nxt = ls1.next();
				 System.out.print("ls1: "+nxt+" ");
                 while(ls.hasNext())
                     {
                     String nxt1 = ls.next();
                     if(nxt.equals(nxt1))
                         {
                             count = count + 1;
                         }
						  System.out.print("ls: "+nxt1+" ");
                     }
               System.out.println(count);
               }
  
        
    }
    
}