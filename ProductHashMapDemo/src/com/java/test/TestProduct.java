package com.java.test;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.java.beans.Product;

import com.java.service.ProductService;
import com.java.service.ProductServiceImpl;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductService ps=new ProductServiceImpl();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1. Add new product\n 2. Display all\n 3. Display by id\n 4. Display by name\n 5. Sort by id\n 6. Sort by name\n 7. Sort by category\n 8.Delete by id\n 9. Exit \n Enter choice:  ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				ps.addNewProduct();
				break;
			case 2:
				Map<Integer,Product> mm=ps.displayAll();
				if(mm!=null) {
					System.out.println(mm);
				}else {
					System.out.println("Not found");
				}
				break;
			case 3:
				System.out.println("Enter id");
				int id=sc.nextInt();
				Product p=ps.displayById(id);
				if(p!=null) {
					System.out.println(p);
				}else {
					System.out.println("not found");
				}
				break;
			case 4:
				System.out.println("Enter Name");
				String nm=sc.next();
				Set<Product> ss=ps.displayByName(nm);
				if(ss!=null) {
					System.out.println(ss);
				}else {
					System.out.println("not found");
				}
				break;
			case 5:
				Set<Product> s=ps.sortById();
				for(Product p1:s) {
					System.out.println(p1);
				}
				break;
			case 6:
				TreeSet<Product> s1=ps.sortByName();
				for(Product p1:s1) {
					System.out.println(p1);
				}
				break;
			case 7:
				break;
			case 8:
				System.out.println("Enter id");
				 id=sc.nextInt();
				boolean status=ps.deleteById(id);
				if(status) {
					System.out.println("Deleted successfully!");
				}else {
					System.out.println("not found");
				}
				break;
			case 9:
				sc.close();
				System.out.println("Thank you for visiting!");
				break;
			default:
					System.out.println("wrong choice..");
			}
		}while(choice!=9);
	}

}
