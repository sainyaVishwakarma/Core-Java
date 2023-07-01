package com.java.beans;

public class Employee implements Comparable<Employee>{
	private int empid;
	private String empname;
	private String desg;
	private int sal;
	public Employee() {
		super();
	}
	public Employee(int empid, String empname, String desg,int sal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.desg = desg;
		this.sal=sal;
	}
	public Employee(int empid) {
		super();
		this.empid = empid;
		this.empname = null;
		this.desg = null;
		this.sal=0;
	}
	
	public boolean equals(Object ob) {
		System.out.println("in equals method"+this.empid+"-----"+((Employee)ob).empid);
		return this.empid==((Employee)ob).empid;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", desg=" + desg + ", sal="+ sal +"]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.getSal()-((Employee)o).getSal();
	}
	
	
}
