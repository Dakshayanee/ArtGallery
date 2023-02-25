package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Product;
import com.app.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService prodservice;
	
	public ProductController() {
		System.out.println("in product controller");
	}
	
	 @GetMapping  
	public List<Product> getallprod(){
		return prodservice.getAllProducts();
	}
	 
	 @PostMapping
	 public Product saveallprod(@RequestBody Product prod) {
		 System.out.println("in product post");
		 return prodservice.addproduct(prod);
	 }
	 

}
