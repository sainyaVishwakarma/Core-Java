package com.java.Interface;

import com.java.beans.MyClass;

public interface I2 {
	void m21();
	void m31();
	default void method11() {
		System.out.println("common default method");
	}
	}

