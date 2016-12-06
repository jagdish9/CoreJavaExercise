package com.java.test.cisco;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Question01 {
    public static class LinkedListNode{
        int val;
        LinkedListNode next;
    
        LinkedListNode(int node_value) {
            val = node_value;
            next = null;
        }
    };
    
    public static LinkedListNode _insert_node_into_singlylinkedlist(LinkedListNode head, LinkedListNode tail, int val)
    {
        if(head == null) {
            head = new LinkedListNode(val);
            tail = head;
        }
        else {
            tail.next = new LinkedListNode(val);
            tail = tail.next;
        }
        return tail;
    }
    
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	int N = scan.nextInt();
    	scan.nextLine();
    	
    	LinkedListNode tail = null;
    	LinkedListNode node = null;
    	LinkedListNode head = node;
    	for(int i = 0; i < N; i++)
    	{
    	  tail = _insert_node_into_singlylinkedlist(node, tail, scan.nextInt());
    	  while(node.next != null)
    	  {
    	    node = node.next;
    	  }
    	  node.next = tail;
    	}
    	
    	while(head != null)
    	{
    	  System.out.println(head.val);
    	  head = head.next;
    	}
    	scan.close();
    }
}
    
