package com.java.service;


import java.util.Scanner;
import java.util.Set;

import com.java.beans.Employee;
import com.java.dao.EmployeeDao;
import com.java.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao edao;
	
	public EmployeeServiceImpl() {
		super();
		this.edao = new EmployeeDaoImpl();
	}

	@Override
	public void addNewEmployee() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id: ");
		int id=sc.nextInt();
		System.out.println("Enter employee name: ");
		String nm=sc.next();
		System.out.println("Enter designation: ");
		String desg=sc.next();
		System.out.println("Enter salary: ");
		double s=sc.nextDouble();
		Employee e=new Employee(id,nm,desg,s);
		edao.save(e);
	}

	@Override
	public Set<Employee> displayAll() {
		// TODO Auto-generated method stub
		return edao.getAllEmployee();
	}

	@Override
	public Employee displayById(int id) {
		// TODO Auto-generated method stub
		return edao.getEmployeeById(id);
	}

	@Override
	public Set<Employee> displayByName(String nm) {
		// TODO Auto-generated method stub
		return edao.getEmployeeName(nm);
	}

	@Override
	public Set<Employee> sortBySalary() {
		// TODO Auto-generated method stub
		return edao.getEmployeeBySortedSal();
	}

	@Override
	public boolean modifyById(int id,double s) {
		// TODO Auto-generated method stub
		Employee ob=displayById(id);
		Scanner sc=new Scanner(System.in);
		if(ob!=null) {
		System.out.println("Do you really want to modify");
		System.out.println(ob.getEid()+","+ob.getEname());
		String ans=sc.next();
		if(ans.equals("y")) {
			return edao.updateById(id,s);
		}
		}
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		Employee e=displayById(id);
		Scanner sc=new Scanner(System.in);
		if(e!=null) {
			System.out.println("Do you really want to delete?");
			System.out.println(e.getEid()+","+e.getEname());
			String s=sc.next();
			if(s.equals("y")) {
				return edao.removeById(id);
			}
		}
		return false;
	}

	@Override
	public Set<Employee> sortByName() {
		// TODO Auto-generated method stub
		return edao.getEmployeeBySortedName();
	}

	@Override
	public Set<Employee> sortByDesg() {
		// TODO Auto-generated method stub
		return edao.getEmployeeBySortedDesg();
	}
	
}
