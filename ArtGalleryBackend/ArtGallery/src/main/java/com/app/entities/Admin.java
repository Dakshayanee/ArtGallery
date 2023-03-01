package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin extends BaseEntity {
	@Column(name="first_name",length=20)
       private String firstName;
	@Column(name="last_name",length=20)
       private String LastName;
	@Column(name="email",length=20)
       private String email;
	@Column(name="passward")
       private String passward;
	
	public Admin() {
		System.out.println("in admin");
	}
	
	
	@Override
	public String toString() {
		return "Admin [firstName=" + firstName + ", LastName=" + LastName + ", email=" + email + "]";
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassward() {
		return passward;
	}


	public void setPassward(String passward) {
		this.passward = passward;
	}


	public Admin(String firstName, String lastName, String email, String passward) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.email = email;
		this.passward = passward;
	}
       
}
