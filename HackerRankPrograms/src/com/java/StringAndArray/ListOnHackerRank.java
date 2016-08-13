package com.java.StringAndArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class ListOnHackerRank {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < size; i++)
            {
              list.add(scan.nextInt());
            }
        int query = scan.nextInt();
        while(query > 0)
            {
               String test = scan.next();
               if(test.equals("Insert"))
                   {
                      int x = scan.nextInt();
                      int y = scan.nextInt();
                      list.add(x, y); 
                   }
                else if(test.equals("Delete"))
                    { 
                      int z = scan.nextInt();
                      list.remove(z); 
                    }
               query = query - 1;
             
            }
        
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext())
            {
              System.out.print(iterator.next()+" ");
            }   
    }
}
