package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
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
   

}
