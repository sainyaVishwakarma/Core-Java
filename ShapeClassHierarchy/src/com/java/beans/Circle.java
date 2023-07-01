package com.java.beans;

public class Circle extends Shape{
	private int radius;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(String c,int radius) {
		super(c);
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int r) {
		this.radius=r;
	}

	@Override
	public String toString() {
		return super.toString()+"Circle [radius=" + radius + "]";
	}

	public  int calculateArea() {
		return (int)(Math.PI)*radius*radius;
			
	}
	
	public int calculatePerimeter() {
		return (int)(2*(Math.PI)*radius);
	}
}
