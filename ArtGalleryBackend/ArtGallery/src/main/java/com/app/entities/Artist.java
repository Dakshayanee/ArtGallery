package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="artists")
public class Artist extends BaseEntity {
	@Column(name="first_name",length=20)
    private String firstname;
	@Column(name="last_name",length=20)
    private String lastname;
	@Column(name="email",length=20)
    private String email;
	@Column(name="passward")
    private String passward;
	
	
	
	public Artist() {
		System.out.println("in artist");
	}
	@Override
	public String toString() {
		return "Artist [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
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


	public Artist(String firstname, String lastname, String email, String passward) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.passward = passward;
	}
    
}
