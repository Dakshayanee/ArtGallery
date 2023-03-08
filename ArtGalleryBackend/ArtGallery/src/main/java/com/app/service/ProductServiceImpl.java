package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.Productdto;
import com.app.entities.Category;
import com.app.entities.Product;
import com.app.repository.CategoryRepository;
import com.app.repository.ProductRepository;

import ch.qos.logback.core.status.Status;


@Service
@Transactional
public class ProductServiceImpl implements ProductService  {

	@Autowired
	private ProductRepository prodrepo;
	
	@Autowired
	private CategoryRepository catrepo;
	
	public String findcategory(Productdto input) {	
	//find category by name
	Optional<Category>cat= catrepo.findByName(input.getCatdto());
	Category currentCat=null;
	//Category present then get persistent pojo
	if(cat.isPresent()) {
		currentCat=cat.get();
		}
	else {//category absent then create a new category
		 currentCat=new Category(input.getCatdto(),);
		 catrepo.save(currentCat);
	}
	//extract product details
	Product product=input.getProddto();
	currentCat.addProduct(product);//helper method
	// Link the category pojo with product pojo by adding it into categories product
	
	}
	@Override
	public List<Product> getAllProductsByCategory(Long id) {
		
		return prodrepo.getAllProductsByCategory(id);
	}
	@Override
	public Product addproduct(Product prod) {
		
		return prodrepo.save(prod);
	}
	@Override
	public String deleteProduct(Long id) {
		String productName=prodrepo.findById(id).get().getProductName();
		prodrepo.deleteById(id);
		return productName +"Deleted successfully" ;
	}
	
         
}
