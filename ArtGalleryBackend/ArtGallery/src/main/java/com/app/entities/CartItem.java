package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cart_items")
public class CartItem  extends BaseEntity {
	
	private int quantity;
	@Column(name="total_price")
	private double totalprice;
	

}