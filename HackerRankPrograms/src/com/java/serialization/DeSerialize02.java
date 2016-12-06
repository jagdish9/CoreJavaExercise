package com.java.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialize02 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		FileInputStream fin = new FileInputStream("test.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		Student01 s2 = (Student01)oin.readObject();
		System.out.println(s2.id+" "+s2.name+" "+s2.age);
		oin.close();
		
	}

}
