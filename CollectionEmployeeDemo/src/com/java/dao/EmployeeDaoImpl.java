package com.java.dao;

import java.util.ArrayList;
import java.util.List;

import com.java.Comparator.MyDesgComparator;
import com.java.Comparator.MyNameComparator;
import com.java.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	private static List<Employee> elist;
	static {
		elist=new ArrayList<>();
		elist.add(new Employee(001,"sainya","manager",80000));
		elist.add(new Employee(002,"tarun","web developer",80500));
		elist.add(new Employee(003,"saket","analyst",90000));
	}
	@Override
	public void save(Employee e) {
		// TODO Auto-generated method stub
		elist.add(e);
	}
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		for(int i=0;i<elist.size();i++) {
			System.out.println(elist.get(i));
		}
		return null;
	}
	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		int pos=elist.indexOf(new Employee(id));
		if(pos!=-1) {
			return elist.get(pos);
		}
		return null;
	}
	@Override
	public List<Employee> getEmployeeName(String nm) {
		// TODO Auto-generated method stub
		List<Employee> l=new ArrayList<>();
		for(Employee ob:elist) {
			if(ob.getEmpname().equals(nm)) {
				l.add(ob);
				
			}
		}
		if(l.size()>0) {
			return l;
		}
		return null;
	}
	@Override
	public List<Employee> getEmployeeBySortedSal() {
		// TODO Auto-generated method stub
		List<Employee> nl=new ArrayList<>();
		for(Employee e:nl) {
			nl.add(e);
		}
		nl.sort(null);
		return nl;
	}
	@Override
	public boolean updateById(int id,int s) {
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
		return elist.remove(new Employee(id));
		
	}
	@Override
	public List<Employee> getEmployeeBySortedName() {
		// TODO Auto-generated method stub
		List<Employee> nl=new ArrayList<>();
		for(Employee e:elist) 
			nl.add(e);
			nl.sort(new MyNameComparator());
			return nl;
		}
	@Override
	public List<Employee> getEmployeeBySortedDesg() {
		// TODO Auto-generated method stub
		List<Employee> dl=new ArrayList<>();
		for(Employee e:elist) 
			dl.add(e);
			dl.sort(new MyDesgComparator());
			return dl;
		
	}
		
}
	

