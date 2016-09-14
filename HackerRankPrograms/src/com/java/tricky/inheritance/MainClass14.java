package com.java.tricky.inheritance;

class X14
{
    int m = 1111;
 
    {
        m = m++;
 
        System.out.println(m);
    }
}
 
class Y14 extends X14
{
    {
        System.out.println(methodOfY());
    }
 
    int methodOfY()
    {
        return m-- + --m;
    }
}
 
public class MainClass14
{
    public static void main(String[] args)
    {
        Y14 y = new Y14();
    }
}
