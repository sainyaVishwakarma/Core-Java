package com.java.Comparator;

import java.util.Comparator;

import com.java.beans.Employee;

public class MyDesgComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getDesg().compareTo(o2.getDesg());
	}

}
