package com.java.dao;


import java.util.Comparator;
import java.util.HashSet;

import java.util.Set;
import java.util.TreeSet;

import com.java.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	private static Set<Employee> eset;
	static {
		eset=new HashSet<>();
		eset.add(new Employee(001,"sainya","manager",80000));
		eset.add(new Employee(002,"tarun","web developer",80500));
		eset.add(new Employee(003,"saket","analyst",90000));
	}
	@Override
	public void save(Employee e) {
		// TODO Auto-generated method stub
		eset.add(e);
	}
	@Override
	public Set<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		
		return eset;
	}
	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		for(Employee e:eset) {
			if(e.getEid()==id) {
				return e;
			}
		}
		return null;
	}
	@Override
	public Set<Employee> getEmployeeName(String nm) {
		// TODO Auto-generated method stub
		Set<Employee> l=new HashSet<>();
		for(Employee ob:eset) {
			if(ob.getEname().equals(nm)) {
				l.add(ob);
				
			}
		}
		if(l.size()>0) {
			return l;
		}
		return null;
	}
	@Override
	public Set<Employee> getEmployeeBySortedSal() {
		// TODO Auto-generated method stub
		Set<Employee> nl=new TreeSet<>();
		for(Employee e:eset) {
			nl.add(e);
		}
		
		return nl;
	}
	@Override
	public boolean updateById(int id,double s) {
		// TODO Auto-generated method stub
		Employee ob=getEmployeeById(id);
		if(ob!=null) {
			ob.setSal(s);
			return true;
		}
		return false;
	}
	@Override
	public boolean removeById(int id) {
		// TODO Auto-generated method stub
		return eset.remove(new Employee(id));
		
	}
	@Override
	public Set<Employee> getEmployeeBySortedName() {
	Comparator<Employee> c=(o1,o2)->{return o1.getEname().compareTo(o2.getEname());};
		Set<Employee> nl=new TreeSet<>(c);
		for(Employee e:eset) 
			nl.add(e);
			
			return nl;
		}
	@Override
	public Set<Employee> getEmployeeBySortedDesg() {
		// TODO Auto-generated method stub
		Comparator<Employee> c=(o1,o2)->{return o1.getDesg().compareTo(o2.getDesg());};
		Set<Employee> dl=new TreeSet<>(c);
		for(Employee e:eset) 
			dl.add(e);
			
			return dl;
		
	}
		
}

	

