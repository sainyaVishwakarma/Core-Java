package com.java.service;
import com.java.beans.Employee;
import java.util.List;
public interface EmployeeService {
	void addNewEmployee();
	
	List<Employee> displayAll();
	
	Employee displayById(int id);

	List<Employee> displayByName(String nm);

	

	boolean modifyById(int id,int s);

	boolean deleteById(int id);

	List<Employee> sortBySalary();

	List<Employee> sortByName();

	List<Employee> sortByDesg();
	
	
}
