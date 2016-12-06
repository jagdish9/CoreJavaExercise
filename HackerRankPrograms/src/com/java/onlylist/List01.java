package com.java.onlylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<String> ls = new ArrayList<String>();
		//List<String> ls = new LinkedList<String>();\
		List<String> ls = new Vector<String>();
		ls.add("Anamika");
		ls.add("Zoro");
		ls.add("Sangeeta");
		ls.add("Raaz");
		ls.add("Kumari");
		ls.add("Jaysawal");
		
		for(String str : ls)
		{
			System.out.print(str+" ");
		}
	}

}
