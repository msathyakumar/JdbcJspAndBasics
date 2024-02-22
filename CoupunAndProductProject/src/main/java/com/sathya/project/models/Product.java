package com.sathya.project.models;

public class Product {

	private String name;
	private String coupunCode;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCoupunCode() {
		return coupunCode;
	}

	public void setCoupunCode(String coupunCode) {
		this.coupunCode = coupunCode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "product [name=" + name + ", coupuncode=" + coupunCode + ", price=" + price + "]";
	}

}
