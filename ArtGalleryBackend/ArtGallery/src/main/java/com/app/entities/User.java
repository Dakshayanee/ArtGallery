package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

@Entity

@Table(name="customers")
public class User extends BaseEntity {
	
    @Length(min=3,max=20,message="Invalid or Blank first name!!!")
	@Column(name="first_name",length=20)
	private String firstName;
	@Column(name="last_name",length=20)
	private String lastName;
	@Column(name="email",length=30,unique=true)
	private String custEmail;
	@Column(length=20,nullable=false)
	private String passward;
	private String custAddress;
	@Column(length=10,name="mobile_no")
	private String custMobileNo;
	@Enumerated(EnumType.STRING)
	@Column(name="user_role",length=20)
	private Role userRole;
	
	
	
	

}
