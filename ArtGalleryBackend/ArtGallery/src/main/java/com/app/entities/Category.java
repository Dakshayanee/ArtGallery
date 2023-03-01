package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.ToString;

@Entity
@Table(name="categories")
public class Category extends BaseEntity {
	
    @Column(name="category_name",length=20,unique=true)
	private String CategoryName;
	@Column(name="description",length=500)
	private String CategoryDescription;
	//one-to-many category 1---->*product
	//category :one,parent,inverse
	@JsonIgnoreProperties("productCategory")
	@OneToMany(mappedBy="productCategory",fetch = FetchType.EAGER,  cascade=CascadeType.ALL,orphanRemoval=true)
	private List<Product> products=new ArrayList<>();
	
	public String getCategoryName() {
		return CategoryName;
	}



	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}



	public String getCategoryDescription() {
		return CategoryDescription;
	}



	public void setCategoryDescription(String categoryDescription) {
		CategoryDescription = categoryDescription;
	}



	public List<Product> getProducts() {
		return products;
	}



	public void setProducts(List<Product> products) {
		this.products = products;
	}



	public Category() {
		
	}
	
	

	public Category(String categoryName, String categoryDescription, List<Product> products) {
		super();
		CategoryName = categoryName;
		CategoryDescription = categoryDescription;
		this.products = products;
	}
	
	public void removeProduct(Product p) {
		
		products.remove(p);
		p.setSelectedcategory(null);
	}
	
	@Override
	public String toString() {
		return "Category [CategoryName=" + CategoryName + ", CategoryDescription=" + CategoryDescription + ", products="
				+ products + "]";
	}

}
