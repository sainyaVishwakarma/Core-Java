package com.java.test;

import java.util.Vector;

public class TestVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<>(20,5);
		for(int i=0;i<22;i++) {
			v.add(i);
		}
		System.out.println("size: "+v.size());
		System.out.println("capacity: "+v.capacity());
	}

}
