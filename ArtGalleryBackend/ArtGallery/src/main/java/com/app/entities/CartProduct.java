package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cartproduct")
public class CartProduct {
	
	@Column(name = "total_products")
	private int total_products;
	
	@OneToOne
	@JoinColumn(name = "product_name")
	private CartProduct products;

}
