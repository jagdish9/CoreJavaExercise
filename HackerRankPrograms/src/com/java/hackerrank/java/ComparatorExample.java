package com.java.hackerrank.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ComparatorExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of test cases");
		int size = scan.nextInt();

		Player[] player = new Player[size];

		System.out.println("Enter name of player and score");
		for (int i = 0; i < size; i++) {
			player[i] = new Player(scan.next(), scan.nextInt());
		}
		scan.close();

		Checker checker = new Checker();

		Arrays.sort(player, checker);
		for (int i = 0; i < size; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
	}
}

class Checker implements Comparator<Player> {
	public int compare(Player a, Player b) {
		if (b.score == a.score)
			return a.name.compareToIgnoreCase(b.name);
		else if (b.score > a.score)
			return 1;
		else
			return -1;
	}
}

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}