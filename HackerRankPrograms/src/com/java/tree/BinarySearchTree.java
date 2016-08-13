package com.java.tree;

public class BinarySearchTree {

	public static Node root;

	public BinarySearchTree() {
		BinarySearchTree.root = null;
	}

	public class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	public void insert(int id) {
		Node newNode = new Node(id);

		if (root == null) {
			root = newNode;
			return;
		}

		Node current = root;
		Node parent = null;
		while (true) {
			parent = current;
			if (id < current.data) {
				current = current.left;
				if (current == null) {
					parent.left = newNode;
					return;
				}
			} else {
				current = current.right;
				if (current == null) {
					parent.right = newNode;
					return;
				}
			}

		}
	}

	public void display(Node root) {
		if (root != null) {
			display(root.left);
			System.out.print(root.data + " ");
			display(root.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(3);
		bst.insert(8);
		bst.insert(1);
		bst.insert(4);
		bst.insert(6);
		bst.insert(2);
		bst.insert(10);
		bst.insert(9);
		bst.insert(20);
		bst.insert(25);
		bst.insert(15);
		bst.insert(16);
		System.out.println("Binary Search Tree");
		bst.display(root);
	}

}
