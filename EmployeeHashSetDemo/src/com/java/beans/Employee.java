package com.java.beans;

public class Employee implements Comparable<Employee>{
	private int eid;
	private String ename;
	private String desg;
	private double sal;
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, String desg, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.desg = desg;
		this.sal = sal;
	}
	public Employee(int eid) {
		super();
		this.eid = eid;
		this.ename = null;
		this.desg = null;
		this.sal = 0;
	}
	@Override
	public int hashCode() {
		System.out.println("in hashcode method");
		return eid;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals method");
		return this.eid==((Employee)obj).eid;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", desg=" + desg + ", sal=" + sal + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		System.out.println("in compareTo method");
		return (int)(this.sal-o.sal);
	}
	
	
}
