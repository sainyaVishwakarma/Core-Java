package com.java.Interface;

public interface I1 {
	void m11();
	void m22();
	int i=10;
	public static void m33() {
		System.out.println("In static method");
	}
	
	default int m44(int x) {
		System.out.println(x);
		return x+10;
		
	}
	
	default void method11() {
//		System.out.println("common default method");
	}
}
