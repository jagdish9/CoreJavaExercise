package com.java.StringAndArray;
import java.util.*;

class QueueThird {
    public static void main(String args[] ) throws Exception {
       
      Scanner scan = new Scanner(System.in);
      List<Integer> queue = new ArrayList<Integer>();
      
      int T = scan.nextInt();
      for(int i = 0; i < T; i++)
      {
      	int N = scan.nextInt();
      	int K = scan.nextInt();
      
      	for(int j = 0; j < N; j++)
      	{
      		queue.add(scan.nextInt());
      	}
      	
      int k = 0, c =0;
      for(int m = 0; m < N - 1; m++)
      {
      	if(queue.get(m) < queue.get(m+1))
      	{
      		int r = queue.remove(m);
			c++;
			if(K == c)
			{
			  break;
			}
      	}
      }
      for(int l = 0; l < queue.size(); l++)
      {
      	System.out.print(queue.get(l)+" ");
      }
      System.out.println();
      queue.clear();
    }
  }
}