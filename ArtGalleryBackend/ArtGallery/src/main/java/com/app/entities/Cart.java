package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	
	//cart---->*cartItems
	//one,inverse,parent
	@OneToMany(mappedBy="shoppingCart",cascade=CascadeType.ALL,orphanRemoval=true)
    private List<CartItem> cartItems=new ArrayList<>();
	
<<<<<<< HEAD
	//cart:one,owning,child
	@OneToOne  //def fetch type:EAGER
	@JoinColumn(name="customer_id",nullable=false)
	private User usercart;

=======
	@OneToOne(mappedBy = "product",cascade = CascadeType.ALL,orphanRemoval=true)
	private List<CartProduct> cartProducts=new ArrayList<>();
>>>>>>> c527ea2e14e4133157e54c08beae5c78bee36fd8
}
