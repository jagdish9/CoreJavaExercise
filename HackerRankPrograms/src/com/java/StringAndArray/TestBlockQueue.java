package com.java.StringAndArray;
import java.util.concurrent.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Queue<Integer> call = (Queue<Integer>) new LinkedList();
        Queue<Integer> ideal = (Queue<Integer>) new LinkedList();
        
        for(int i = 0; i < N; i++)
        {
        	call.add(scan.nextInt());
        }
        
        for(int i = 0; i < N; i++)
        {
            ideal.add(scan.nextInt());
        }
        
        int time = 0;
      while(!call.isEmpty() && !ideal.isEmpty())
       {
          if(call.peek() != ideal.peek())
            {
              int d = call.peek();
                  call.poll();
                  call.offer(d);
                  time++;
             }
          else
             {
                call.poll();
                ideal.poll();
                  time++;
              }
        }
        System.out.println(time);
    }
}