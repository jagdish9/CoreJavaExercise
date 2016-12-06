package com.java.basic.tricky;

import java.util.HashSet;
import java.util.Set;

public class ContractHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeKey01 ek1 = new EmployeeKey01("A01", "12091980");
		EmployeeKey01 ek2 = new EmployeeKey01("A01", "12091980");
		EmployeeKey01 ek3 = new EmployeeKey01("A02", "12091980");
		EmployeeKey01 ek4 = new EmployeeKey01("A02", "12091980");
		EmployeeKey01 ek5 = new EmployeeKey01("B01", "17091982");
		
		Set<EmployeeKey01> set = new HashSet<EmployeeKey01>();
		set.add(ek1);
		set.add(ek2);
		set.add(ek3);
		set.add(ek4);
		set.add(ek5);
		
		System.out.println(set);
	}

}

class EmployeeKey01
{
	public String empid;
	public String dob;
	
	public EmployeeKey01(String empid, String dob)
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
		EmployeeKey01 other = (EmployeeKey01) obj;
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

	@Override
	public String toString() {
		return "EmployeeKey01 [empid=" + empid + ", dob=" + dob + "]";
	}
	
}
