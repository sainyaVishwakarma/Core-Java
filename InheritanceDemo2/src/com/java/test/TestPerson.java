package com.java.test;

import java.util.Scanner;

import com.java.service.PersonService;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1. Add new\n 2.Display all \n 3. Calculate percentage\n 4. Calculate grade\n 5. Exit \n Enter choice : ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				
				System.out.println("1. PHD student\n 2. Master Student\n 3. Faculty \n Enter your choice: ");
				int ch=sc.nextInt();
				PersonService.addNew(ch);
				break;
			case 2:
				PersonService.displayAll();
				break;
			case 3: 
				System.out.println("Enter id : ");
				int id=sc.nextInt();
				PersonService.calculatePercentage(id);
				break;
			case 4: 
				break;
			case 5:
				System.out.println("Thank you for visiting!!");
				sc.close();
				break;
			default:
				System.out.println("Wrong choice");
			}
		}while(choice!=5);
		
	}

}
