package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
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
	
}
