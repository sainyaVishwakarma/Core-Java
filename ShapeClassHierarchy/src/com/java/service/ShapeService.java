package com.java.service;

import java.util.Scanner;

import com.java.beans.Circle;
import com.java.beans.Rectangle;
import com.java.beans.Shape;
import com.java.beans.Square;
import com.java.beans.Triangle;

	public class ShapeService {
	private static Shape[] sarr;
	private static int cnt;
	static {
		sarr=new Shape[20];
		cnt=0;
	}
	
	public static void addNewShape(int ch) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Color");
		String c=sc.next();
		switch(ch) {
		case 1:
			System.out.println("Enter base : ");
			int b=sc.nextInt();
			System.out.println("Enter Height : ");
			int h=sc.nextInt();
			System.out.println("Enter s1 : ");
			int s1=sc.nextInt();
			System.out.println("Enter s2 : ");
			int s2=sc.nextInt();
			sarr[cnt]=new Triangle(c,b,h,s1,s2);
			break;
		case 2:
			
			System.out.println("Enter base : ");
			 b=sc.nextInt();
			System.out.println("Enter Height : ");
			 h=sc.nextInt();
			 sarr[cnt]=new Rectangle(c,b,h);
			 break;
		case 3:
			System.out.println("Enter radius : ");
			int r=sc.nextInt();
			sarr[cnt]=new Circle(c,r);
			break;
		case 4:
			System.out.println("Enter side : ");
			int s=sc.nextInt();
			sarr[cnt]=new Square(c,s);
			
		}
		cnt++;
	}

	public static void displayAll() {
		// TODO Auto-generated method stub
		for(int i=0;i<cnt;i++) {
			System.out.println(sarr[i]);
		}
	}

	public static String calculateDetails(int id) {
		// TODO Auto-generated method stub
		int pos=searchById(id);
		if(pos!=-1) {
			int area=sarr[pos].calculateArea();
			int perimeter=sarr[pos].calculatePerimeter();
			return area+","+perimeter;
		}else {
			return null;
		}
	}

	public static int searchById(int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<cnt;i++) {
			if(sarr[i].getId()==n) {
				return i;
			}
		}
		return -1;
	}
	
	public static void countShapes() {
		int tc=0,cc=0,rc=0,sc=0;
		for(int i=0;i<cnt;i++) {
			if(sarr[i] instanceof Triangle) {
				 tc++;
			}else if(sarr[i] instanceof Rectangle) {
				 rc++;
			}
			else if(sarr[i] instanceof Circle) {
				 cc++;
			}else {
				 sc++;
			}
		}
		System.out.println("triangle count : "+tc);
		System.out.println("Circle count : "+cc);
		System.out.println("Rectangle count : "+rc);
		System.out.println("Square count : "+sc);
		
	}
	
}

