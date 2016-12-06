package com.doubles.linkedlist;

class Base1
{
    public void display()
    {
        System.out.println("hack");
    }
}

class Derived1 extends Base1
{
    public void display()
    {
        System.out.println("Derived");
    }
}

public class M
{
    public static void main(String args[])
    {
        Derived1 d=new Derived1();
        d.display();
    }
}
