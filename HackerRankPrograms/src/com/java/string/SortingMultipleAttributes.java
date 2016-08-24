package com.java.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingMultipleAttributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-----Sorting by multiple attributes------");
		List<Employee> listemp = new ArrayList<Employee>();
		
	   listemp.add(new Employee("Anant", "Developer", 25, 25000));
	   listemp.add(new Employee("Singham", "Actor", 35, 50000));
	   listemp.add(new Employee("Manoj", "Runner", 26, 30000));
	   listemp.add(new Employee("Alika", "Dancer", 20, 27000));
	   listemp.add(new Employee("Swastika", "Teacher", 30, 40000));
	   listemp.add(new Employee("Zoya", "Comedian", 28, 25000));
	   listemp.add(new Employee("Tark", "Zymnstic", 21, 30000));
	   listemp.add(new Employee("Narendra", "Office", 45, 60000));
	   listemp.add(new Employee("Sehdev", "Milkman", 40, 19000));
	   listemp.add(new Employee("Anil", "Actor", 45, 70000));
	   
	   System.out.println("----Before Sorting-----");
	   for(Employee ls : listemp)
	   {
		   System.out.println(ls);
	   }
	   
	   Collections.sort(listemp, new EmployeeChaninedComparator(new EmployeeJobTitleComparator(),
	   new EmployeeAgeComparator(), new EmployeeSalaryComparator(), new EmployeeNameComparator()));
	   
	   System.out.println("\n-----After Sorting-----");
	   for(Employee lsemp : listemp)
	   {
		   System.out.println(lsemp);
	   }
	}

}
