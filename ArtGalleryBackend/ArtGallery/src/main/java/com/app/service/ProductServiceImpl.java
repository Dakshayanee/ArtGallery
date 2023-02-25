package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.Product;
import com.app.repository.ProductRepository;


@Service
@Transactional
public class ProductServiceImpl implements ProductService  {

	@Autowired
	private ProductRepository prodrepo;
	@Override
	public List<Product> getAllProducts() {
		
		return prodrepo.findAll();
	}
	@Override
	public Product addproduct(Product prod) {
		
		return prodrepo.save(prod);
	}
	
         
}
