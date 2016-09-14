package com.java.database.practise;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		for(int i = 0; i < 10; i++)
		{
			String s = "Name_0"+i;
			int deptno  = 9+i;
			map.put(i, new Employee(i, s, deptno));
		}
		
		Set<Map.Entry<Integer, Employee>> set = map.entrySet();
		Iterator<Map.Entry<Integer, Employee>> it = set.iterator();
		
		while(it.hasNext())
		{
			Map.Entry<Integer, Employee> mentry = (Map.Entry<Integer, Employee>)it.next();
			Employee emp1 = mentry.getValue();
			System.out.println("Key is: "+mentry.getKey() +" and values are, empid: "+emp1.getId()+ " empname "+
			emp1.getEmpName()+" deptno: "+emp1.getDeptNo());
		}
	}

}
