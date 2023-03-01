package com.app.service;

import java.util.List;

import com.app.entities.Product;

public interface ProductService {
	List<Product> getAllProductsByCategory(Long id);
	public Product addproduct(Product prod);
	public String deleteProduct(Long id); 
		
		
	
	

}
