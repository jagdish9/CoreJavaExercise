package com.java.tricky.inheritance;

class X06
{
    static void staticMethod()
    {
        System.out.println("Class X");
    }
}
 
class Y06 extends X06
{
    static void staticMethod()
    {
        System.out.println("Class Y");
    }
}
 
public class MainClass06
{
    public static void main(String[] args)
    {
        Y06.staticMethod();
    }
}
