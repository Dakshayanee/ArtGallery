package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart_items")
public class CartItem  extends BaseEntity {
	
	private int quantity;
	@Column(name="total_price")
	private double totalprice;
	
	//cart 1---->*many cartItem
	@ManyToOne
	@JoinColumn(name="cart_id",nullable=false)
	private Cart shoppingCart;
	
	@OneToOne
<<<<<<< HEAD
	@JoinColumn(name="product_id")
	private Product product;
=======
	@JoinColumn(name = "product_name")
	private Cart cartProduct;
>>>>>>> c527ea2e14e4133157e54c08beae5c78bee36fd8

}
