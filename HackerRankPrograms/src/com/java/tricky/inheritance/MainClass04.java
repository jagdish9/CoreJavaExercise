package com.java.tricky.inheritance;

class B04 extends A04
{
    static
    {
        System.out.println("SECOND");
    }
}

class A04
{
    static
    {
        System.out.println("THIRD");
    }
}
 

 
class C04 extends B04
{
    static
    {
        System.out.println("FIRST");
    }
}
 
public class MainClass04
{
    public static void main(String[] args)
    {
        C04 c = new C04();
    }
}
