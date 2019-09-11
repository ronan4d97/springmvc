package com.springmvcone;

public class Product {

	private String code, name;
	private int price;
	
	public Product(String code, String name, int price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}
	public Product() {}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
}
