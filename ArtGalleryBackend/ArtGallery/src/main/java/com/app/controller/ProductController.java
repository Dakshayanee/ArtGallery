package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.Responsedto;
import com.app.entities.Category;
import com.app.entities.Product;
import com.app.service.CategoryService;
import com.app.service.ProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {
	
	@Autowired
	private ProductService prodservice;
	
	@Autowired
	private CategoryService catservice;
	
	public ProductController() {
		System.out.println("in product controller");
	}
	
	//show all by category
	 @GetMapping("/category{categoryname}") 
	public ResponseEntity<?>getallprodByCategory(@PathVariable String CategoryName){
		Category cat=catservice.findByName(CategoryName);
		return new ResponseEntity<>(new Responsedto("success",prodservice.getAllProductsByCategory(cat.getId())),HttpStatus.OK);
	}
	 
	 @PostMapping
	 public Product saveallprod(@RequestBody Product prod) {
		 System.out.println("in product post");
		 return prodservice.addproduct(prod);
	 }
	 
	 @DeleteMapping("/delete/{id}")
	 public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
		 return new ResponseEntity<>(new Responsedto("success",prodservice.deleteProduct(id)),HttpStatus.OK); 
		 
	 }
	 

}
