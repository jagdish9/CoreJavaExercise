package com.java.tricky.inheritance;

class A1
{
    {
        System.out.println(1);
    }
}
 
class B1 extends A1
{
    {
        System.out.println(2);
    }
}
 
class C extends B1
{
    {
        System.out.println(3);
    }
}
 
public class MainClass01
{
    public static void main(String[] args)
    {
        C c = new C();
    }
}