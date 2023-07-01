package com.java.service;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.java.beans.Product;
import com.java.dao.ProductDao;
import com.java.dao.ProductDaoImpl;
public class ProductServiceImpl implements ProductService{
	private  ProductDao pdao;
	
	public ProductServiceImpl() {
		super();
		this.pdao = new ProductDaoImpl();
	}

	@Override
	public void addNewProduct() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product id");
		int id=sc.nextInt();
		System.out.println("Enter product name");
		String nm=sc.next();
		System.out.println("Enter category id");
		int cid=sc.nextInt();
		
		Product p=new Product(id,nm,cid);
		pdao.save(p);
		
	}

	@Override
	public Map<Integer,Product> displayAll() {
		// TODO Auto-generated method stub
		return pdao.getAllProduct();
	}

	@Override
	public Product displayById(int id) {
		// TODO Auto-generated method stub
		return pdao.getProdById(id);
	}

	@Override
	public Set<Product> displayByName(String nm) {
		// TODO Auto-generated method stub
		return pdao.getProdByName(nm);
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you really want to delete?");
		String ans=sc.next();
		if(ans.equals("y"))
		return pdao.removeById(id);
		return false;
	}

	@Override
	public Set<Product> sortById() {
		// TODO Auto-generated method stub
		return pdao.sortById();
	}

	@Override
	public TreeSet<Product> sortByName() {
		// TODO Auto-generated method stub
		return pdao.sortByName();
	}

}
