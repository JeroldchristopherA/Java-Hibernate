package com.product;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alcohol {
	
	@Id
	private String brandname;
	private double price;
	private String type;
	private int serialno;
	
	
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSerilano() {
		return serialno;
	}
	public void setSerilano(int serilano) {
		this.serialno = serilano;
	}
	
	@Override
	public String toString() {
		return "Alcohol [brandname=" + brandname + ", price=" + price + ", type=" + type + ", serialno=" + serialno
				+ "]";
	}

}
