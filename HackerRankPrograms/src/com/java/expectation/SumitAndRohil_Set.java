package com.java.expectation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SumitAndRohil_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        String[] str = new String[N];
        List<String> ls = new ArrayList<String>();
        for(int i = 0; i < N; i++)
        {
        	str[i] = scan.nextLine().trim();
        }
        
        for(int i = 0; i < N; i++)
         {
        	int len = str[i].length();
        	int val = 0;
        	//count = 0;
		   
        	 for(int j = 0; j < len; j++)
 	         {
 	        	val = val + (int)str[i].charAt(j);
 	         }
        	 
        	 for(int k = i; k < N; k++)
        	 {
        		 int lenRem = str[k].length();
        		 int valRem = 0;
        		 for(int l = 0; l < lenRem; l++)
        		 {
        			valRem = valRem + (int)str[k].charAt(l); 
        		 }
        		 
        		 if(val == valRem)
        		 {
        			 if(str[i].charAt(len-1) == str[k].charAt(lenRem-1) 
        					 && str[k].charAt(0) == str[i].charAt(0))
        			 {
        				 boolean flag = true;
        				 Iterator<String> it = ls.iterator();
        				 while(it.hasNext())
        				 {
        					 String res = it.next();
        					 int lenRem_res = res.length();
        	        		 int valRem_res = 0;
        	        		 for(int x = 0; x < lenRem_res; x++)
        	        		 {
        	        			valRem_res = valRem_res + (int)res.charAt(x); 
        	        		 }
        					 if(res.charAt(0) == str[i].charAt(0) 
        							 && res.charAt(res.length()-1) == str[i].charAt(len-1)
        							 && val == valRem_res)
        					 {
        						 flag =  false;
        					 }
        					
        				 }
        				 if(flag)
            			 {
            				 ls.add(str[i]);
            			 } 
        				 
        			 }
        			
        		 }
        		 else
        		 {
        			 boolean _flag1 = true;
        			 Iterator<String> it1 = ls.iterator();
    				 while(it1.hasNext())
    				 {
    					 String res = it1.next();
    					 if(res.equals(str[i]))
    					 {
    						 _flag1 =  false;
    					 }
    					
    				 }
    				 if(_flag1)
        			 {
        				 ls.add(str[i]);
        			 } 
        		 } 
        	
        	 }
        	 
         }
        System.out.println(ls.size());
        scan.close();
        
	}

}
