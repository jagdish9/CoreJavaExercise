package com.java.insertion;

public class InsertOnHead {

	class Node {
		int data;
		Node next;
	}

	Node Insert(Node head, int x) {

		Node temp = head;
		Node newNode = new Node();
		newNode.data = x;
		newNode.next = null;

		if (temp == null) {
			head = newNode;
			return head;
		} else {
			newNode.next = temp;
			head = newNode;
			return head;
		}
	}
}
