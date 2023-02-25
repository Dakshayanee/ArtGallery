package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
<<<<<<< HEAD
=======
import javax.persistence.ManyToOne;
>>>>>>> c527ea2e14e4133157e54c08beae5c78bee36fd8
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
<<<<<<< HEAD
@Table(name="addresses")
public class Address extends BaseEntity {
	@Column(name="Street")
   private String street;
	@Column(name="Lane")
   private String lane;
	@Column(name="City")
   private String city;
	@Column(name="State")
   private String state;
	@Column(name="Pincode")
   private int pincode;
	
	@OneToOne
	@JoinColumn(name="user_id",nullable=false)
   private User useraddress;
   

=======
@Table(name = "address")
public class Address {
	
	@Column(name = "street",length = 30)
	private String street;
	
	@Column(name = "lane",length = 30)
	private String lane;
	
	@Column(name = "state",length = 10)
	private String state;
	
	@Column(name = "city",length = 10)
	private String city;
	
	@Column(name = "pincode")
	private double pincode;
	
	//one-to-one association with category
	@OneToOne
	@JoinColumn(name = "cust_address",nullable = false)
	private User custAddress;
	
>>>>>>> c527ea2e14e4133157e54c08beae5c78bee36fd8
}
