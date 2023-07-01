package com.java.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyFile {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fout=null;
		try {
			//open the file
			 fis=new FileInputStream("test.txt");
			
			 fout=new FileOutputStream("testcopy.txt",true);
			//reading
			 int i=fis.read();
			 while(i!=-1) {
				 fout.write(i);
				 //System.out.println(i);
				 i=fis.read();
			 }
			 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//close the file
			 fis.close();
			 fout.close();
			}catch(IOException e) {
			  System.out.println("error occured");
			}
		}
	}

}