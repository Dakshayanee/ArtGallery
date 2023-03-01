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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.Productdto;
import com.app.dto.Responsedto;
import com.app.entities.Category;
import com.app.service.CategoryService;

@RestController
@CrossOrigin(origins="http://localhost:4000")
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired
	private CategoryService catservice;
	
	public CategoryController() {
		System.out.println("in Category controller");
	}
	
	@GetMapping("all")
	public ResponseEntity<?> getallCategories(){
		//List<Category> categories=catservice.getallCategories();
		return new ResponseEntity<>(new Responsedto("success",catservice.getallCategories()),HttpStatus.OK) ;
				
	} 
	
	@PostMapping("/add")
	 public ResponseEntity<?>saveCategory(@RequestBody Category cat) {
		return new ResponseEntity<>(new Responsedto("success",catservice.addCategory(cat)),HttpStatus.CREATED) ;
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteCategory(@PathVariable Long id){
		   
		return new ResponseEntity<>(new Responsedto("success",catservice.deleteCategorybyId(id)),HttpStatus.OK);
	}
	
	@PutMapping("/edit")
	public ResponseEntity<?> editCategory(@RequestBody Category cat){
		return new ResponseEntity<>(new Responsedto("success",catservice.updateCategory(cat)),HttpStatus.CREATED);
	}
	
	
	

}
