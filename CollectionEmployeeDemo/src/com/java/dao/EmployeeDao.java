package com.java.dao;

import java.util.List;

import com.java.beans.Employee;

public interface EmployeeDao {
	void save(Employee e);

	List<Employee> getAllEmployee();

	Employee getEmployeeById(int id);

	List<Employee> getEmployeeName(String nm);

	List<Employee> getEmployeeBySortedSal();

	boolean updateById(int id,int s);

	boolean removeById(int id);

	List<Employee> getEmployeeBySortedName();

	List<Employee> getEmployeeBySortedDesg();
}
