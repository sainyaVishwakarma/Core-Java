package com.java.test;

import java.util.Scanner;

import com.java.beans.Shape;
import com.java.beans.Triangle;
import com.java.service.ShapeService;

public class TestShape {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int choice=0;	
		do {
		System.out.println("1. Add new shape\n 2.display all\n 3.Calculate Area and Perimeter of specific shape\n  4.exit\n  choice: ") ;
		choice=sc.nextInt();
		switch(choice) {
		case 1: 
			System.out.println("1. Triangle\n 2.Rectangle\n 3.Circle\n 4.Square\n enter choice: ");
			int ch=sc.nextInt();
			ShapeService.addNewShape(ch);
			break;
			
		case 2:
			ShapeService.displayAll();
			break;
		
		case 3:
			System.out.println("Enter id to calculate area and perimeter: ");
			int id=sc.nextInt();
			String data=ShapeService.calculateDetails(id);
			if(data!=null) {
				System.out.println("Area and perimeter is : "+data);
			}else {
				System.out.println("Not found");
			}
			break;
		case 4:
			sc.close();
			System.out.println("Thank you for visiting !!");
			break;
		
		default:
			System.out.println("Wrong Choice");
		}
		}while (choice!=4);
		ShapeService.countShapes();
		
		
	}

}
