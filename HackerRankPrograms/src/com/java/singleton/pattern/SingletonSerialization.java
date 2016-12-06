package com.java.singleton.pattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonSerialization {

	public static void main(String[] args) throws Throwable 
	{

	    Singleton01 s = Singleton01.getInstance();
	    s.i = 5;

	 //   ByteArrayOutputStream baos = new ByteArrayOutputStream();
	 //   ObjectOutputStream oos = new ObjectOutputStream(baos);
	    FileOutputStream baos = new FileOutputStream("test.txt");
		ObjectOutputStream oos = new ObjectOutputStream(baos);
	    oos.writeObject(s);
	    oos.flush();
	    oos.close();

	    s.i = 7; //modified after serialization

	 //   InputStream is = new ByteArrayInputStream(baos.toByteArray());
	 //   ObjectInputStream ois = new ObjectInputStream(is);
	    FileInputStream is = new FileInputStream("test.txt");
		ObjectInputStream ois = new ObjectInputStream(is);
	    Singleton01 deserialized = (Singleton01) ois.readObject();
	    System.out.println(deserialized.i);  // prints 5
	    ois.close();
	}

}
