package com.java.tricky.inheritance;

class A02
{
    String s = "Class A";
}
 
class B02 extends A02
{
    String s = "Class B";
 
    {
        System.out.println(super.s);
    }
}
 
class C02 extends B02
{
    String s = "Class C";
 
    {
        System.out.println(super.s);
    }
}
 
public class MainClass02
{
    public static void main(String[] args)
    {
        C02 c = new C02();
 
        System.out.println(c.s);
    }
}
