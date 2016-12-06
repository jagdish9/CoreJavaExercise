package com.java.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student01 implements Serializable
{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	 String name;
	 transient int age;
	
	public Student01(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

public class Serialize02 {

	public static void main(String[] args) throws IOException
	{
	Student01 s1 = new Student01(200, "Hemn", 54);
	FileOutputStream fout = new FileOutputStream("test.txt");
	ObjectOutputStream out = new ObjectOutputStream(fout);
	
	out.writeObject(s1);
	out.flush();
	System.out.println("Success");
	out.close();
	}
}
