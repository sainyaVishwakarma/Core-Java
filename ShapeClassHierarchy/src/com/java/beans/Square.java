package com.java.beans;

public class Square extends Shape{
	private int side;

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(String c,int s) {
		super(c);
		this.side = s;
	}

	public int getSide() {
		return side;
		
	}
	public void setSide(int s) {
		this.side=s;
	}

	@Override
	public String toString() {
		return super.toString()+"Square [side=" + side + "]";
	}
	
	public  int calculateArea() {
		return side*side;
			
	}
	
	public int calculatePerimeter() {
		return 4*side;
	}
}
