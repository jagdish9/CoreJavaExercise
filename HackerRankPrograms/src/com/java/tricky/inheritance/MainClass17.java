package com.java.tricky.inheritance;

class A17
{
    void A17()
    {
        System.out.println(1);
    }
}
 
class B17 extends A17
{
    void B17()
    {
        A17();
    }
}
 
public class MainClass17
{
    public static void main(String[] args)
    {
        new B17().B17();
    }
}
