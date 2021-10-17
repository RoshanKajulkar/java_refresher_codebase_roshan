package com.java.store;

import com.java.item.Item;
import com.java.user.User;

public interface Store {

    void addItem(Item item);

    void removeItem(int id);

    Bill generateBill(User user) throws EmptyCartException;
    
    void showInventory();
}
