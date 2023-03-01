package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name="products")
@Entity
public class Product extends BaseEntity {
	
@Column(name="product_name",length=20)	
private String productName;
@Column(name="product_description",length=50)	
private String Description;	
private double price;
@Column(name="in_Stock")	
private boolean inStock;


//many-to-one association with category
@ManyToOne
@JoinColumn(name="category_id",nullable=false)
@JsonIgnoreProperties("products")
private Category productCategory;

public Product(String productName, String description, double price, boolean inStock, Category productCategory) {
	super();
	this.productName = productName;
	Description = description;
	this.price = price;
	this.inStock = inStock;
	this.productCategory = productCategory;
}
public Product() {
	
}


@Override
public String toString() {
	return "Product [productName=" + productName + ", Description=" + Description + ", price=" + price + ", inStock="
			+ inStock + ", productCategory=" + productCategory + "]";
}
public String getProductName() {
	return productName;
}


public void setProductName(String productName) {
	this.productName = productName;
}


public String getDescription() {
	return Description;
}


public void setDescription(String description) {
	Description = description;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


public boolean isInStock() {
	return inStock;
}


public void setInStock(boolean inStock) {
	this.inStock = inStock;
}


public Category getProductCategory() {
	return productCategory;
}


public void setProductCategory(Category productCategory) {
	this.productCategory = productCategory;
}

@JsonIgnore
public Category getSelectedcategory() {
	return productCategory;
}

public void setSelectedcategory(Category selectedcategory) {
	this.productCategory =productCategory;
}






}
