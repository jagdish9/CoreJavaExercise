package com.java.basic.tricky;

import java.util.HashMap;
import java.util.Map;

public class ContractTest {

	public static void main(String[] args)
	{
		Map<EmployeeKey, String> cache = loadEmpCache();
		
		EmployeeKey lookUpKey = new EmployeeKey("B01", "15121984");
		
		String lookUp = cache.get(lookUpKey);
		
		System.out.println(lookUp);
	}
	
	static Map<EmployeeKey, String> loadEmpCache()
	{
		EmployeeKey emp1 = new EmployeeKey("A01", "10121988");
		EmployeeKey emp2 = new EmployeeKey("B01", "15121984");
		EmployeeKey emp3 = new EmployeeKey("C01", "20121990");

		Map<EmployeeKey, String> cache = new HashMap<EmployeeKey, String>();
		cache.put(emp1, "Arjun");
		cache.put(emp2, "Vastav");
		cache.put(emp3, "Rana");
		
		return cache;
	}
}

class EmployeeKey
{
	public String empid;
	public String dob;
	
	public EmployeeKey(String empid, String dob)
	{
		this.empid = empid;
		this.dob = dob;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((empid == null) ? 0 : empid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeKey other = (EmployeeKey) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (empid == null) {
			if (other.empid != null)
				return false;
		} else if (!empid.equals(other.empid))
			return false;
		return true;
	}
	
	
}