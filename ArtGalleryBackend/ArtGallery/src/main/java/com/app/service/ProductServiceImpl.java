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
