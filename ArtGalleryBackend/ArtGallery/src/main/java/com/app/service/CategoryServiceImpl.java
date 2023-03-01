package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.CategoryNotFoundException;
import com.app.entities.Category;
import com.app.repository.CategoryRepository;
import com.app.repository.ProductRepository;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
    private CategoryRepository catrepo;
	
	@Autowired
	private ProductRepository prodrepo;

	@Override
	public List<Category> getallCategories() {
		
		return catrepo.findAll();
	}

	@Override
	public Category addCategory(Category cat) {
		
		return catrepo.save(cat);
	}

	@Override
	public String deleteCategorybyId(Long id) {
		Category category=catrepo.findById(id).get();
		String  categoryName=category.getCategoryName();
		category.getProducts().forEach(product->{
			 prodrepo.deleteById(product.getId());
			
		});
		return categoryName + "Category Deleted Successfully";
	}

	@Override
	public Category updateCategory(Category cat) {
		
		return catrepo.save(cat) ;
	}

	@Override
	public Category findByName(String categoryName) {
		return catrepo.findByName(categoryName).orElseThrow(()
				->new CategoryNotFoundException("No such category available"));
		
	}
	    
	

}
