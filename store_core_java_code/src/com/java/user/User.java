package com.java.user;

import java.util.ArrayList;

import com.java.item.ElectronicItem;
import com.java.item.Item;
import com.java.store.ElectronicStore;

public class User {
    private ArrayList<CartItem> cart = new ArrayList<>();
    private String userName;
    private String userMobileNumber;
    
    private static int userCount;
    
    public User(String userName, String userMobileNumber) {
    	this.userName = userName;
    	this.userMobileNumber = userMobileNumber;
    	userCount++;
    }
    
    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMobileNumber() {
		return userMobileNumber;
	}

	public void setUserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}

	public static int getUserCount() {
    	return userCount;
    }
    
    public void addToCart(ElectronicStore store, int itemId, int qty) throws NegativeQuantityException, ZeroQuantityException, ProductNotFoundException{
        
    	//negative quantity exception
    	if(qty < 0) {
    		throw new NegativeQuantityException("Negative Quantity for an item not possible!");
    	}
    	
    	//zero quantity exception
    	if(qty == 0) {
    		throw new ZeroQuantityException("Zero Quantity for an item not allowed!");
    	}
    	
    	ArrayList<ElectronicItem> list = store.getItems();
    	
    	boolean itemPresent = false;
    	
    	for(ElectronicItem item : list) {
    		if(item.getId() == itemId) {
    			itemPresent = true;
    		}
    	}
    	
    	if(!itemPresent) {
    		throw new ProductNotFoundException("incorrect product id");
    	}
    	cart.add(new CartItem(itemId,qty));
    	System.out.println("Item added to the cart!");
    }

    public void removeFromCart(Item item){
        //remove from cart logic
    	//logic to check if the item does not exist in the class
    	// throw new ItemNotInCartException
    }

    public ArrayList<CartItem> getCart(){
    	
        return cart;
    }
}
