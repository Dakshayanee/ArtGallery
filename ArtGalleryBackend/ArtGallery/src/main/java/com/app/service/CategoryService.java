package com.app.service;

import java.util.List;

import com.app.entities.Category;

public interface CategoryService {
       List<Category> getallCategories();
       public Category addCategory(Category cat);
	    public String deleteCategorybyId(Long id);
	    public Category updateCategory(Category cat);
	    Category findByName(String categoryName);
}
