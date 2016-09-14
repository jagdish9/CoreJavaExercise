package com.java.tricky.inheritance;

class A15
{
    static String s = "AAA";
 
    static
    {
        s = s + "BBB";
    }
 
    {
        s = "AAABBB";
    }
}
 
class B15 extends A15
{
    static
    {
        s = s + "BBBAAA";
    }
 
    {
        System.out.println(s);
    }
}
 
public class MainClass15
{
    public static void main(String[] args)
    {
        B15 b = new B15();
    }
}