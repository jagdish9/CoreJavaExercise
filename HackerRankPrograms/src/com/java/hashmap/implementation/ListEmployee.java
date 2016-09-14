package com.java.hashmap.implementation;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

class EmployeeComparator implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		/*if(e1.getId() == e2.getId())
			return 0;
		else if(e1.getId() > e2.getId())
			return 1;
		else
		   return -1;*/
		
		if(e1.getNames().equals(e2.getNames()))
		{
			return e1.getNames().compareTo(e2.getNames());
		}
		else
		{
			//return e1.getDesignation().compareTo(e2.getDesignation());
			if(e1.getYearsOfExperience() == e2.getYearsOfExperience())
				return 0;
			else if(e1.getYearsOfExperience() > e2.getYearsOfExperience())
				return 1;
			else
			   return -1;
		}
		
	}
}
public class ListEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> ls = new ArrayList<Employee>();
		ls.add(new Employee(100, "Zensa", "Software Engineer", 2));
		ls.add(new Employee(50, "yachat", "Senior Software Engineer", 4));
		ls.add(new Employee(70, "sidar", "Associate Software Engineer", 6));
		ls.add(new Employee(40, "Aarti", "Associate Consultant", 8));
		ls.add(new Employee(80, "newought", "Consultant", 9));
		ls.add(new Employee(60, "priyanka", "Senior Consultant", 18));
		ls.add(new Employee(30, "devnag", "Associate Architate", 15));
		ls.add(new Employee(50, "jayanti", "System Engineer", 12));
		ls.add(new Employee(90, "priyanka", "Project Manager", 16));
		ls.add(new Employee(10, "cuake", "Delivery Manager", 15));
		
		Collections.sort(ls, new EmployeeComparator());
		
		System.out.println("ID  | Name | Designation | Years_Of_Experience");
		System.out.println();
		Iterator<Employee> it = ls.iterator();
		while(it.hasNext())
		{
			Employee emp = it.next();
			System.out.println(emp.getId()+"  | "+emp.getNames()+
					" | "+emp.getDesignation()+" | "+emp.getYearsOfExperience());
		}
		
	}

}
