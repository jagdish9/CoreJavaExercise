package com.java.tree;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class TopView {

	/*
	 * class Node int data; Node left; Node right;
	 */
	void top_view(Node root) {
		if (root == null)
			return;
		Stack<Integer> s = new Stack<Integer>();
		s.push(root.data);
		Node root2 = root;
		while (root.left != null) {
			s.push(root.left.data);
			root = root.left;
		}
		while (s.size() != 0) {
			System.out.print(s.pop() + " ");

		}

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(root2.right.data);
		root2 = root2.right;
		while (root2.right != null) {
			q.add(root2.right.data);
			root2 = root2.right;
		}
		while (q.size() != 0) {
			System.out.print(q.poll() + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
