package com.java.service;

import java.util.Scanner;

import com.java.beans.Faculty;
import com.java.beans.MasterStudent;
import com.java.beans.Person;
import com.java.beans.PhdStudent;
import com.java.beans.Student;

public class PersonService {
	private static Person[] parr;
	private static int cnt;
	static {
		parr=new Person[20];
		cnt=0;
	}
	public static void addNew(int ch) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pid: ");
		int id=sc.nextInt();
		System.out.println("Enter pname: ");
		String nm=sc.next();
		System.out.println("Enter mobile: ");
		String m=sc.next();
		if(ch<3) {
			System.out.println("Enter m1: ");
				int m1=sc.nextInt();
				System.out.println("Enter m2: ");
				int m2=sc.nextInt();
				System.out.println("Enter m3: ");
				int m3=sc.nextInt();
				
				if(ch==1) {
					
					System.out.println("Enter special course marks: ");
					int scm=sc.nextInt();
					System.out.println("Enter thesis : ");
					String t=sc.next();
					parr[cnt]=new PhdStudent(id,nm,m,m1,m2,m3,scm,t);
				}
				else {
					System.out.println("Enter m4: ");
					int m4=sc.nextInt();
					System.out.println("Enter m5: ");
					int m5=sc.nextInt();
					System.out.println("Enter special course marks: ");
					int spcm=sc.nextInt();
					parr[cnt]=new MasterStudent(id,nm,m,m1,m2,m3,m4,m5,spcm);
				}	
		}
		else {
			System.out.println("Enter skill: ");
			 String s=sc.next();
			System.out.println("Enter Department name: ");
			 String d=sc.next();
			 parr[cnt]=new Faculty(id,nm,m,s,d);
		}	
		cnt++;
		}
	
	public static void displayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(parr[i]);
		}
	}

	public static float calculatePercentage(int id) {
		// TODO Auto-generated method stub
		Student s=searchById(id);
		if(s!=null) {
		return s.calcPer();
		}
		return -1;
	}

	private static Student searchById(int id) {
		// TODO Auto-generated method stub
		for(int i=0;i<cnt;i++) {
			if(parr[i].getPid()==id)
				if(parr[i] instanceof Student)
				return (Student)parr[i];
		}
		return null;
	}
}
