package com.java.collection;

public class Person {

	private String name, comment;
	private int age;

	public Person(String n, int a, String c) {
		name = n;
		comment = c;
		age = a;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Person)) {
			return false;
		}

		Person p = (Person) o;
		return age == p.age && name.equals(p.name);
	}

	public int hashCode() {
		return super.hashCode();
	}
}
