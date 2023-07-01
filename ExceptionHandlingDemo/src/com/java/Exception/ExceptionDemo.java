package com.java.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	public static int divide(int i,int j) {
		int ans=0;
		try {
		 ans=i/j;
		 return ans;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	for(int k=0;k<3;k++) {
	try {
	System.out.println("Enter i: ");
	int i=sc.nextInt();
	System.out.println("Enter j: ");
	int j=sc.nextInt();
	int ans=divide(i,j);
	System.out.println(ans);
	break;
	}
	catch(InputMismatchException e) {
		System.out.println("Enter number: ");
		System.out.println(e.getMessage());
		sc.next();
	}
	catch(Exception e){
		System.out.println("Error occured");
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("in finally block");
	}
	}
	}
}
