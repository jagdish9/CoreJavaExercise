package com.java.tricky.inheritance;


class M13
{
int i = 51;

public M13(int j)
{
    System.out.println(i);

    this.i = j * 10;
}
}

class N13 extends M13
{
public N13(int j)
{
    super(j);

    System.out.println(i);

    this.i = j * 20;
}
}

public class MainClass13
{
public static void main(String[] args)
{
    N13 n = new N13(26);

    System.out.println(n.i);
}
}
