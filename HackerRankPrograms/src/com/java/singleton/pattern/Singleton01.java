package com.java.singleton.pattern;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Singleton01 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static Singleton01 instance = new Singleton01();
	int i;
          
	public static Singleton01 getInstance() {
	    return instance;
	}

	private Singleton01() {
	}

	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
	    ois.defaultReadObject();
	    instance = this;
	}

	private Object readResolve()  {
	    return instance;
	} 

	
}
