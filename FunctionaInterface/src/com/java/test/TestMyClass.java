package com.java.test;

import com.java.Interface.MyFunctionalInterface;
//import com.java.beans.MyClassGeneric;

public class TestMyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MyFunctionalInterface intInterface=new MyClassGeneric();
		MyFunctionalInterface<String> strInterface=(x,y)->{
			return x.length()>y.length()?x:y;
		};
		
		MyFunctionalInterface<Integer> intInterface=(x,y)->{
			return x>y?x:y;
		};
		
		int n=intInterface.myCompare(30,58);
		System.out.println(n);
		String s=strInterface.myCompare("sainya","Vishwakarma");
		System.out.println(s);
	}

}
