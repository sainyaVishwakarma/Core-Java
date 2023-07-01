package com.java.service;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.java.beans.Product;


public interface ProductService {

	void addNewProduct();

	Map<Integer,Product> displayAll();

	Product displayById(int id);

	Set<Product> displayByName(String nm);

	boolean deleteById(int id);

	Set<Product> sortById();

	TreeSet<Product> sortByName();

}
