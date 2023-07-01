package com.java.test;

import com.java.beans.MyClass;
import com.java.threads.MyThread;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass ob=new MyClass();
		MyClass ob1=new MyClass();
		MyThread th= new MyThread(ob,5);
		MyThread th1= new MyThread(ob,7);
		MyThread th2= new MyThread(ob1,9);
		th.start();
		th1.start();
		th2.start();
		System.out.println("in main method");
		try {
			th.join();
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main ends");
	}

}
