package com.java.test;

import com.java.service.StudentService;
import com.java.service.StudentServiceImpl;

public class TestSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService ss=new StudentServiceImpl();
		ss.readFile();
		ss.writeFile();
	}

}
