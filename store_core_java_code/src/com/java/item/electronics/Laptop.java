package com.java.item.electronics;

import com.java.item.ElectronicItem;

public final class Laptop  extends ElectronicItem{
	public Laptop(String productName, double price, int id) {
		super(productName, price, id);
	}

	@Override
	public String toString() {
		return "Laptop [getId()=" + getId() + ", getProductName()=" + getProductName() + ", getPrice()=" + getPrice()
				+ "]";
	}
	
	
}
