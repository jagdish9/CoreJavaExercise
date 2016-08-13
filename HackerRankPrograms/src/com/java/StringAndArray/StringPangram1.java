package com.java.StringAndArray;
import java.util.Scanner;

public class StringPangram1
{
  public static final int n = 26; 

    public int stringTest(String arr){
        if(arr.length() < n){
           return -1;
        }
        for(char c = 'A'; c <= 'Z' ; c++){
            if((arr.indexOf(c) < 0) && (arr.indexOf((char)(c + 32)) < 0))
			{
               return -1;
            }
			System.out.println(c+" "+(arr.indexOf(c))+" "+arr.indexOf((char)(c + 32)));
        }
        return 1;
    }


    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
		System.out.println("Enter String:");
        String s = s1.nextLine();
        StringPangram1 st = new StringPangram1();

        int d = st.stringTest(s);

        if(d == -1)
            System.out.println("not pangram");
        else
             System.out.println("pangram");

    }
}