package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="carts")
public class Cart extends BaseEntity {
	@Column(name="total_items")
	private int totalItems;
	@Column(name="total_cart_price")
	private double totalCartPrice;
	@Column(name="crated_on")
	private LocalDate  createdOn;
	@Column(name="last_updated_on")
	private LocalDate lastupdatedOn;
	

}
