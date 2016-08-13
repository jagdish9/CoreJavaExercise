package com.java.StringAndArray;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class KirtiAndBirthdayGiftWithBufferedReader {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        
        String[] aStr = new String[N];
        for(int i = 0; i < N; i++)
        {
        	aStr[i] = br.readLine();
        }
        
        int Q = Integer.parseInt(br.readLine());
        for(int j = 0; j < Q; j++)
        {
        	int c = 0;
            String input = br.readLine();
        	String[] str = input.split(" ");
        	int l = Integer.parseInt(str[0]);
        	int r = Integer.parseInt(str[1]);
        	String S = str[2];
        	for(int k = 0; k < r; k++)
        	{
        		if(aStr[k].equals(S))
        		{
        			c++;
        		}
        	}
        	System.out.println(c);
        }
    }
}