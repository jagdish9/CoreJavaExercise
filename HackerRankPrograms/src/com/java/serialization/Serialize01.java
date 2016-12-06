package com.java.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	 String name;
	
	public Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
}

public class Serialize01 {

	public static void main(String[] args) throws IOException
	{
		Student s1 = new Student(100, "Jack01");
		FileOutputStream fout = new FileOutputStream("test.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(s1);
		out.flush();
		System.out.println("Success");
		out.close();
	}
}
