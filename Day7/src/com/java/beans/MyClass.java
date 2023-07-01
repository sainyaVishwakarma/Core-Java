package com.java.beans;

import com.java.Interface.I1;
import com.java.Interface.I2;

public class MyClass implements I1,I2{

	@Override
	public void m11() {
		//compilation error i is final variable by default 
//		I1.i=50; 
	}

	@Override
	public void m22() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m21() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m31() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method11() {
		// TODO Auto-generated method stub
		I2.super.method11();
	}
	
}
