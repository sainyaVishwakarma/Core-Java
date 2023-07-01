package com.java.test;
import java.util.Scanner;
import java.util.Set;

import com.java.beans.Employee;
import com.java.service.EmployeeService;
import com.java.service.EmployeeServiceImpl;
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EmployeeService es=new EmployeeServiceImpl();
		int choice=0;
		do {
			System.out.println("1. Add new emplyoee \n2. Display all\n 3. Display by id\n4. Display by name\n 5. Sort by salary\n 6. Sort by name\n 7. Modify salary\n 8. Delete by id\n 9. Sort by designation\n 10. Exit\n Enter choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1: 
				es.addNewEmployee();
				break;
			case 2:
				Set<Employee> ss=es.displayAll();
				for(Employee e:ss) {
					System.out.println(e);
				}
				break;
			case 3:
				System.out.println("Enter id: ");
				int n=sc.nextInt();
				Employee e=es.displayById(n);
				if(e!=null) {
					System.out.println(e);
				}else {
					System.out.println("not found");
				}
				break;
			case 4:
				System.out.println("Enter name: ");
				String nm=sc.next();
				Set<Employee> nmList=es.displayByName(nm);
				if(nmList!=null) {
					for(Employee ob:nmList)
					System.out.println(ob);
				}else {
					System.out.println("not found");
				}
				break;
			case 5:
				Set<Employee> l=es.sortBySalary();
				for(Employee ob: l) {
					
					System.out.println(ob);
				}
				break;
			case 6:
				l=es.sortByName();
				for(Employee ob:l) {
					
					System.out.println(ob);
				}
				break;
			case 7:
				System.out.println("Enter id: ");
				int id=sc.nextInt();
				System.out.println("Enter modified salary: ");
				double s=sc.nextDouble();
				boolean status=es.modifyById(id,s);
				if(status) {
					System.out.println("Modified successfully.....");
				}else {
					System.out.println("not found");
				}
				break;
			case 8:
				System.out.println("Enter id: ");
				id=sc.nextInt();
		
				status=es.deleteById(id);
				if(status) {
					System.out.println("Deleted successfully.....");
				}else {
					System.out.println("not found");
				}
				break;
			case 9:
				Set<Employee> ll=es.sortByDesg(); 
				for(Employee ob:ll) {
					System.out.println(ob);
				}
				break;
			case 10:
				sc.close();
				System.out.println("Thank you for visiting.....");
				break;
			default:
				System.out.println("Wrong choice!!");
			}
		}while(choice!=9);
	}

}
