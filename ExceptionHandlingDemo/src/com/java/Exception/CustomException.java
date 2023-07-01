package com.java.Exception;

import java.util.Scanner;
import com.java.test.WrongAgeException; 
public class CustomException {
	
	public static void acceptData() throws WrongAgeException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		if((age<18) || (age>60)) {
			throw new WrongAgeException("age should not be less than 18 or greater than 60");
			
		}
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		try {
			acceptData();
		}catch(WrongAgeException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
