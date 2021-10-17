package com.java.store;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

import com.java.item.ElectronicItem;
import com.java.item.Item;
import com.java.user.CartItem;
import com.java.user.User;

public class ElectronicStore implements Store { // isA relation
    //hasA
    private ArrayList<ElectronicItem> items = new ArrayList<ElectronicItem>();
    private ArrayList<Bill> transactions = new ArrayList<Bill>();

    public ArrayList<ElectronicItem> getItems() {
		return items;
	}

	public ArrayList<Bill> getTransactions() {
		return transactions;
	}

	public ElectronicStore(ElectronicItem[] list){
    	
    	//initializing the store
    	for(ElectronicItem e: list) {
    		items.add(e);
    	}  
    	
    }

    public void addItem(Item item){
        System.out.println(item);
        if(item instanceof ElectronicItem) {
        	items.add((ElectronicItem) item);
        }
    }

    public void removeItem(int id){
        //remove item logic
    	System.out.println("removing item with id:" + id);
    	
    	Iterator<ElectronicItem> it = items.iterator();
    	
    	ArrayList<ElectronicItem> tempList = new ArrayList<ElectronicItem>();
    	
    	while(it.hasNext()) {
    		ElectronicItem item = it.next();
    		System.out.println(item);
    		if(item.getId() != id) {
    			tempList.add(item);
    		
    		}
    	}
    	items = tempList;
    }

    //uses a and produces a relationship
    public Bill generateBill(User user) throws EmptyCartException{
        
    	//fetching user cart
    	ArrayList<CartItem> cart = user.getCart();
    	
    	//generate bill
    	if (cart.size() == 0) {
    		throw new EmptyCartException("Cart is Empty!");
    	}
    	
    	//logic to generate a bill from the cart
    	double total = 0;
    	
    	for(CartItem cartItem : cart) {
    		int id = cartItem.getItemId();
    		int qty = cartItem.getQty();
    		
    		for(ElectronicItem item: items) {
    			if(item.getId() == id) {
    				total = total + (item.getPrice() * qty);
    			}
    		}
    		
    	}
    	
    	Bill bill = new Bill(user.getUserName(), user.getUserMobileNumber(),  total);
    	transactions.add(bill);
        return bill;
    }

	@Override
	public String toString() {
		return "ElectronicStore [items=" + items + ", transactions=" + transactions + "]";
	}

	public void showInventory() {
		Iterator<ElectronicItem> itemIterator= items.iterator();
		while(itemIterator.hasNext()) {
			System.out.println(itemIterator.next());
		}
	}
    
	public void printTransactions() {
		System.out.println("printing transactions on transaction.txt..");
		System.out.println("Trying to open a file for writing...");
		try {
			FileOutputStream fout = new FileOutputStream("transaction.txt");
			System.out.println("File is ready to write the data... ");
			String str = "Bill Id\tUser Name\tTotal Bill\tTimeStamp\n";
			byte array[] = str.getBytes();
			fout.write(array);
			
			for(Bill b: transactions) {
				
				str = b.getBillId() + "\t" + b.getUserName() + "\t\t" + b.getTotalBill() + "\t\t" + b.getTransactionTime() +"\n";
				array = str.getBytes();
				fout.write(array);
				
            }
			
			System.out.println("data copied to transaction.txt!");
			
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
