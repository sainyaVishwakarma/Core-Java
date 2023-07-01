
package com.java.service;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.java.beans.Student;

public class StudentServiceImpl implements StudentService{
	private static List<Student> lst;
	static {
		lst=new ArrayList<>();
		lst.add(new Student(2,"aaa",524125.0));
		lst.add(new Student(3,"bbb",215125.0));
		lst.add(new Student(4,"ccc",824125.0));
	}
	@Override
	public void readFile() {
		// TODO Auto-generated method stub
		
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("test.txt"));) {
			while(true) {
			System.out.println((Student)ois.readObject());
			}
	}catch(EOFException e) {
		e.printStackTrace();
	} 	// TODO Auto-generated catch block
	
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	}

	@Override
	public void writeFile() {
		// TODO Auto-generated method stub
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("test.txt"));) {
			for(Student ob:lst) {
				oos.writeObject(ob);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
