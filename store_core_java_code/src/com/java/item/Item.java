package com.java.item;

public abstract class Item {
	private String productName;
	private double price;
	private final int id;
	
	public int getId() {
		return id;
	}

	public Item(String productName, double price, int id) {
		this.productName = productName;
		this.price = price;
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
