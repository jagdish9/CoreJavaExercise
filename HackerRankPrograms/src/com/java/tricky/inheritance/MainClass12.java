package com.java.tricky.inheritance;

class M12
{
    int i;
 
    public M12(int i)
    {
        this.i = i--;
    }
}
 
class N12 extends M12
{
    public N12(int i)
    {
        super(++i);
 
        System.out.println(i);
    }
}
 
public class MainClass12
{
    public static void main(String[] args)
    {
        N12 n = new N12(26);
    }
}
