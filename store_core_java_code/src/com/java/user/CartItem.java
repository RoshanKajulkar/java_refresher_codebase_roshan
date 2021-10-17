package com.java.user;

public class CartItem {
    private int itemId;
    private int qty;
    
    public CartItem(int itemId, int qty) {
    	this.itemId = itemId;
    	this.qty = qty;
    }

	@Override
	public String toString() {
		return "CartItem [itemId=" + itemId + ", qty=" + qty + "]";
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getItemId() {
		return itemId;
	}
    
    
}
