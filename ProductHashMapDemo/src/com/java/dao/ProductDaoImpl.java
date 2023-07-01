package com.java.dao;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.java.beans.Product;

public class ProductDaoImpl implements ProductDao{
	private static Map<Integer,Product> hm;
	static{
		hm=new HashMap<>();
		hm.put(1,new Product(1,"lays",1));
		hm.put(2,new Product(2,"dorito",1));
		hm.put(3,new Product(3,"maggie",2));
		hm.put(4,new Product(4,"pasta",2));
		hm.put(6,new Product(6,"maggie",2));
		hm.put(5,new Product(5,"dorito",1));
	}
	@Override
	public void save(Product p) {
		// TODO Auto-generated method stub
		hm.put(p.getPid(),p);
	}
	@Override
	public Map<Integer,Product> getAllProduct() {
		// TODO Auto-generated method stub
		return hm;
	}
	@Override
	public Product getProdById(int id) {
		// TODO Auto-generated method stub
		return hm.get(id);
		
	}
	@Override
	public Set<Product> getProdByName(String nm) {
		// TODO Auto-generated method stub
		Set<Product> p=new HashSet<>();
		
		for(Integer prod:hm.keySet()) {
			if(hm.get(prod).getPname().equals(nm)) 
				p.add(hm.get(prod));
				
			
		}
		if(p.size()>0) {
			return p;
		}
		return null;
		
	
	}
	@Override
	public boolean removeById(int id) {
		// TODO Auto-generated method stub'
		Product p=hm.get(id);	
		if(p!=null) {
			hm.remove(id);
			return true;
		}
		return false;
		
	}
	@Override
	public Set<Product> sortById() {
		// TODO Auto-generated method stub
		Set<Product> l=new TreeSet<>();
		for(Integer p:hm.keySet()) {
			l.add(hm.get(p));
		}
		return l;
		
	}
	@Override
	public TreeSet<Product> sortByName() {
		// TODO Auto-generated method stub
		
		Comparator<Product> c=(o1,o2)->{
			return (o1.getPname().compareTo(o2.getPname()) );
		};
		TreeSet<Product> l=new TreeSet<>(c);
		for(Integer p:hm.keySet()) {
			l.add(hm.get(p));
		}
	
		return l;
	}
	
	
}
