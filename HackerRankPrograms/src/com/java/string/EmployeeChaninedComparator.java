package com.java.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeChaninedComparator implements Comparator<Employee>{

	private List<Comparator<Employee>> listComparators;
	
	public EmployeeChaninedComparator(Comparator<Employee>... comparators)
	{
	  this.listComparators = Arrays.asList(comparators);	
	}
	
	public int compare(Employee emp1, Employee emp2)
	{
		for(Comparator<Employee> comparator : listComparators)
		{
			int result = comparator.compare(emp1, emp2);
			if(result != 0)
			{
				return result;
			}
		}
		return 0;
	}
}
