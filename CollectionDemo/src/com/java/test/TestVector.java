package com.java.test;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<>();
//		System.out.println("capacity:" v.capacity());
		System.out.println("capacity: "+v.capacity());
		v.add(25);
		v.add(30);
		v.add(74);
		System.out.println("size: "+v.size());
		System.out.println("capacity: "+v.capacity());
		
		for(int i=0;i<10;i++) {
			v.add(i);
//			System.out.println(v.get(i));
		}System.out.println("size: "+v.size());
		System.out.println("capacity: "+v.capacity());
	}

}
