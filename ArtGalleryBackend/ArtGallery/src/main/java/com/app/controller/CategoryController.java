package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Category;
import com.app.service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired
	private CategoryService catservice;
	
	public CategoryController() {
		System.out.println("in Category controller");
	}
	
	@GetMapping
	public List<Category> allCategories(){
		return catservice.getallCategories();
				
	} 
	
	
	

}
