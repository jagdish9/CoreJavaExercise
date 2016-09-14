package com.java.tricky.inheritance;

class A05
{
    public A05()
    {
        System.out.println("Class A Constructor");
    }
}
 
class B05 extends A05
{
    public B05()
    {
        System.out.println("Class B Constructor");
    }
}
 
class C05 extends B05
{
    public C05()
    {
        System.out.println("Class C Constructor");
    }
}
 
public class MainClass05
{
    public static void main(String[] args)
    {
        C05 c = new C05();
    }
}
