package com.java.test;

import com.java.Interface.I1;
import com.java.Interface.I2;
import com.java.beans.MyClass;

public class TestMyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I1 ob=new MyClass();
		I1.m33();
		ob.m44(5);
		((MyClass)ob).m21();
	}

}
