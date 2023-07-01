package com.java.Comparator;

import java.util.Comparator;

import com.java.beans.Employee;

public class MyNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpname().compareTo(o2.getEmpname());
	}

}
