package com.doubles.linkedlist;

public class Test1 extends Thread {
    public void run() {
        System.out.println("Hacker");
    }
    public void run(String s) {
        System.out.println("Earth");
    }
    public static void main(String[] args) {
        new Test1().start();
    }
}
