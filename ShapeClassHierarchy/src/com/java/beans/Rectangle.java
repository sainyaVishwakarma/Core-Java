package com.java.beans;

public class Rectangle extends Shape{
	private int base;
	private int height;
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(String c,int base, int height) {
		super(c);
		this.base = base;
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return super.toString()+"Rectangle [base=" + base + ", height=" + height + "]";
	}

	public  int calculateArea() {
		return base*height;
			
	}
	
	public int calculatePerimeter() {
		return 2*base*height;
	}
}
