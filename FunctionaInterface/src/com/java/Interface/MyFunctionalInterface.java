package com.java.Interface;

@FunctionalInterface
public interface MyFunctionalInterface <T>{
	T myCompare(T x,T y);
	
	public static void myStatic1() {
		System.out.println("in static 1 method");
	}
	
	public static void myStatic2() {
		System.out.println("in static 2 method");
	}
	
	default void m1() {
		System.out.println("in default 1 method");
	}
	
	default void m2() {
		System.out.println("in default 2 method");
	}
}
