package com.sathya.project.models;

public class Coupun {
	private String name;
	private String code;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Coupun [name=" + name + ", code=" + code + ", price=" + price + "]";
	}

}
