package com.java.tricky.inheritance;

class M11
{
    static
    {
        System.out.println('A');
    }
 
    {
        System.out.println('B');
    }
 
    public M11()
    {
        System.out.println('C');
    }
}
 
class N11 extends M11
{
    static
    {
        System.out.println('D');
    }
 
    {
        System.out.println('E');
    }
 
    public N11()
    {
        System.out.println('F');
    }
}
 
public class MainClass11
{
    public static void main(String[] args)
    {
        N11 n = new N11();
    }
}
