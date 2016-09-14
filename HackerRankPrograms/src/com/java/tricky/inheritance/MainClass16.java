package com.java.tricky.inheritance;

class X16
{
    int i = 101010;
 
    public X16()
    {
        i = i++ + i-- - i;
    }
 
    static int staticMethod(int i)
    {
        return --i;
    }
}
 
class Y16 extends X16
{
    public Y16()
    {
        System.out.println(staticMethod(i));
    }
}
 
public class MainClass16
{
    public static void main(String[] args)
    {
        Y16 y = new Y16();
    }
}
