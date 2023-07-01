package com.java.beans;

public class Faculty extends Person{
	private String skill;
	private String dept;

	public Faculty() {
		super();
	}

	public Faculty(int id,String nm,String m,String skill, String dept) {
		super(id,nm,m);
		this.skill = skill;
		this.dept = dept;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString()+"Faculty [skill=" + skill + ", dept=" + dept + "]";
	}
	
}
