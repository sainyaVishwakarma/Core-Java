package com.java.dao;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.java.beans.Product;

public interface ProductDao {

	void save(Product p);

	Map<Integer,Product> getAllProduct();

	Product getProdById(int id);

	Set<Product> getProdByName(String nm);

	boolean removeById(int id);

	Set<Product> sortById();

	TreeSet<Product> sortByName();

	

}
