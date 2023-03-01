package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.entities.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("select p from product p join fetch p.productCategory.id=:id ")
	List<Product> getAllProductsByCategory(@Param("id")Long id);

	
	
	
}
