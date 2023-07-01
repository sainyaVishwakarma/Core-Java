package com.java.beans;

public abstract class Student extends Person{
	private int m1,m2,m3;

	public Student(int id,String nm,String m,int m1, int m2, int m3) {
		super(id,nm,m);
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	public Student() {
		super();
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	@Override
	public String toString() {
		return super.toString()+"Student [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
	
	public  abstract float calcPer();
	
}
