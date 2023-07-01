package com.java.service;
import com.java.beans.Employee;

import java.util.Set;
public interface EmployeeService {
	void addNewEmployee();
	
	Set<Employee> displayAll();
	
	Employee displayById(int id);

	Set<Employee> displayByName(String nm);

	

	boolean modifyById(int id,double s);

	boolean deleteById(int id);

	Set<Employee> sortBySalary();

	Set<Employee> sortByName();

	Set<Employee> sortByDesg();
	
	
}
