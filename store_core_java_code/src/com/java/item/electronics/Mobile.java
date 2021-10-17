package com.java.item.electronics;

import com.java.item.ElectronicItem;

public final class Mobile extends ElectronicItem{
	public Mobile(String productName, double price, int id) {
		super(productName, price, id);
	}

	@Override
	public String toString() {
		return "Mobile [getId()=" + getId() + ", getProductName()=" + getProductName() + ", getPrice()=" + getPrice()
				+ "]";
	}
}
