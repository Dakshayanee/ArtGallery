package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class Category extends BaseEntity {
	@Column(name="category_name",length=20,unique=true)
	private String CategoryName;
	@Column(name="description",length=100)
	private String CategoryDescription;
	//one-to-many category 1---->*product
	//category :one,parent,inverse
	@OneToMany(mappedBy="productCategory",cascade=CascadeType.ALL,orphanRemoval=true)
	private List<Product> products=new ArrayList<>();

}
