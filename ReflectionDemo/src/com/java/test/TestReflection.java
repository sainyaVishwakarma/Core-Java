package com.java.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.java.beans.MyClass;

public class TestReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass m=new MyClass(11,"xxx");
		Class cls=m.getClass();
		Method[] arr=cls.getMethods();
		for(Method ob:arr) {
			System.out.println(ob.getName());
		}
		
		Constructor[] carr=cls.getConstructors();
		for(Constructor ob:carr) {
			System.out.println(ob.getName());
			System.out.println(ob.getParameterCount());
		}
		
		Field[] farr=cls.getDeclaredFields();
		for(Field ob:farr) {
			System.out.println(ob.getType().getName());
		}
		farr[0].setAccessible(true);
		farr[1].setAccessible(true);
		try {
			farr[0].set(m,15);
			farr[1].set(m,"yyyy");
			System.out.println(m);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		m.method1(85);
		Method tm;
		try {
			tm = cls.getDeclaredMethod("method1", int.class);
			try {
				tm.invoke(m, 45);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
