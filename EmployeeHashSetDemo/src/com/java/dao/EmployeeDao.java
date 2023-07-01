package com.java.dao;


import java.util.Set;

import com.java.beans.Employee;

public interface EmployeeDao {
	void save(Employee e);

	Set<Employee> getAllEmployee();

	Employee getEmployeeById(int id);

	Set<Employee> getEmployeeName(String nm);

	Set<Employee> getEmployeeBySortedSal();

	boolean updateById(int id,double s);

	boolean removeById(int id);

	Set<Employee> getEmployeeBySortedName();

	Set<Employee> getEmployeeBySortedDesg();
}
