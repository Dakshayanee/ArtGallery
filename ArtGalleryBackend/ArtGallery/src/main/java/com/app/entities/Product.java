package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

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
}
