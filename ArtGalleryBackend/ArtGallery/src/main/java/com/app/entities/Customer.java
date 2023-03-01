package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;


@Entity
@Table(name="customers")
public class Customer extends BaseEntity {
	
    @Length(min=3,max=20,message="Invalid or Blank first name!!!")
	@Column(name="first_name",length=20)
	private String fisrstName;
	@Column(name="last_name",length=20)
	private String lastName;
	@Column(name="email",length=30,unique=true)
	private String custEmail;
	@Column(length=20,nullable=false)
	private String passward;
	private String custAddress;
	@Column(length=10,name="mobile_no")
	private String custMobileNo;
	@Column(name="street_name")
	private String streetname;
	@Column(name="colony_name")
	private String colony;

	
	
	@Override
	public String toString() {
		return "Customers [fisrstName=" + fisrstName + ", lastName=" + lastName + ", custEmail=" + custEmail
				+ ", custAddress=" + custAddress + ", custMobileNo=" + custMobileNo + "]";
	}
	public String getFisrstName() {
		return fisrstName;
	}
	public void setFisrstName(String fisrstName) {
		this.fisrstName = fisrstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getCustMobileNo() {
		return custMobileNo;
	}
	public void setCustMobileNo(String custMobileNo) {
		this.custMobileNo = custMobileNo;
	}
	
	
	public Customer(@Length(min = 3, max = 20, message = "Invalid or Blank first name!!!") String fisrstName,
			String lastName, String custEmail, String passward, String custAddress, String custMobileNo) {
		super();
		this.fisrstName = fisrstName;
		this.lastName = lastName;
		this.custEmail = custEmail;
		this.passward = passward;
		this.custAddress = custAddress;
		this.custMobileNo = custMobileNo;
		
	}
	public Customer() {
		System.out.println("in customer");
	}
	
	
	
	
	
	

}
