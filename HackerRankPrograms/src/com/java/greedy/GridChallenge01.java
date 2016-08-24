package com.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GridChallenge01 {

	private static boolean test(char[][] arr)
    {
        int len = arr.length;
        for(int i = 0; i < len; i++)
            {
              for(int j = 0; j < len - 1; j++)
                  {
                    if(arr[j][i] > arr[j+1][i])
                        {
                          return false;
                        }
                  }
            }
        return true;
    }

public static void main(String[] args) throws NumberFormatException, IOException {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(scan.readLine().trim());
    for(int i = 0; i < T; i++)
      {
         int N = Integer.parseInt(scan.readLine().trim());
          char[][] arr = new char[N][N];
          for(int j = 0; j <N; j++)
              {
                String str  = scan.readLine().trim();
                for(int k = 0; k < str.length(); k++)
                    {
                      arr[j][k] = str.charAt(k);
                    }
              }
        for(int l = 0; l < N; l++)
        {
            for(int m = 0; m < N-1; m++)
                {
                  for(int t = 0; t < N - m - 1; m++)
                      {
                        if(arr[m][t] > arr[m][t+1])
                            {
                              char ch = arr[m][t];
                              arr[m][t] = arr[m][t+1];
                              arr[m][t+1] = ch;
                            }
                      }
                }
        }
         if(test(arr))
             {
               System.out.println("YES");
             }
         else
             {
               System.out.println("NO");
             }
      }
    
}
}
