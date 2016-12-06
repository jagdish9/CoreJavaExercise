package com.java.singleton.pattern;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class Singleton01Serialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

      Singleton01 sgn = Singleton01.getInstance();
      sgn.i = 10;
      
      // serialization
      ByteArrayOutputStream bao = new ByteArrayOutputStream();
      ObjectOutputStream os = new ObjectOutputStream(bao);
      os.writeObject(sgn);
      os.flush();
      os.close();
      
      sgn.i = 45;
      
      // de-serialization
      ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
      ObjectInputStream ois = new ObjectInputStream(bis);
      Singleton01 sn = (Singleton01)ois.readObject();
      PrintStream ps = System.out;
      ps.println(sn.i);
	}

}
