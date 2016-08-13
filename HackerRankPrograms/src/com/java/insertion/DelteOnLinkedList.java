package com.java.insertion;

public class DelteOnLinkedList {

	class Node {
		int data;
		Node next;
	}

	Node Delete(Node head, int position) {
		// Complete this method

		Node temp = head;
		Node prev = new Node();
		if (temp == null) {
			head = temp;
		} else {
			if (position == 0) {
				temp = temp.next;
				head = temp;
			} else {
				while (position > 0) {
					prev = temp;
					temp = temp.next;
					position = position - 1;
				}
				prev.next = temp.next;

			}
		}
		return head;
	}

}
