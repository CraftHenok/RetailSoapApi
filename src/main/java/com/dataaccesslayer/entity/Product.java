package com.dataaccesslayer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
 
 

@Entity
@Table(name = "PRODUCT_MASTER")

public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull
	@Column(unique = true)
	private String barCodeId;

	@NotNull
	private String name;

	@NotNull 
	private String productCategory;

	@NotNull
	private double rate;

	public Product() {
		super();
	}

	public Product(String barCodeId, double rate, String name, String productCategory) {
		super();
		this.barCodeId = barCodeId;
		this.rate = rate;
		this.name = name;
		this.productCategory = productCategory;
	}

	public String getBarCodeId() {
		return barCodeId;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public double getRate() {
		return rate;
	}

	public void setBarCodeId(String barCodeId) {
		this.barCodeId = barCodeId;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String toString() {
		return "";
	}

}
