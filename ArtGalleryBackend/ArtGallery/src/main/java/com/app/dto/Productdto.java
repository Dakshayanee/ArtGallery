package com.app.dto;

import com.app.entities.Category;
import com.app.entities.Product;

public class Productdto {
	
	private Product proddto;
	private String catdto;
    private Boolean stock;
    
    
	public Product getProddto() {
		return proddto;
	}
	    
	public Productdto() {
		
	}
	
	@Override
	public String toString() {
		return "Productdto [proddto=" + proddto + ", catdto=" + catdto + ", stock=" + stock + "]";
	}

	public Productdto(Product proddto, String catdto, Boolean stock) {
		super();
		this.proddto = proddto;
		this.catdto = catdto;
		this.stock = stock;
	}
	public void setProddto(Product proddto) {
		this.proddto = proddto;
	}
	public String getCatdto() {
		return catdto;
	}
	public void setCatdto(String catdto) {
		this.catdto = catdto;
	}
	public Boolean getStock() {
		return stock;
	}
	public void setStock(Boolean stock) {
		this.stock = stock;
	}
    
    
    
    
    
	

}
