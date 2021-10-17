import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.java.item.ElectronicItem;
import com.java.item.electronics.Laptop;
import com.java.item.electronics.Mobile;
import com.java.store.Bill;
import com.java.store.ElectronicStore;
import com.java.store.EmptyCartException;
import com.java.store.comparators.IdComparator;
import com.java.store.comparators.NameComparator;
import com.java.store.comparators.TotalBillComparator;
import com.java.user.NegativeQuantityException;
import com.java.user.ProductNotFoundException;
import com.java.user.User;
import com.java.user.ZeroQuantityException;

public class Association {
	
	public static void addItemToCart(User userObj,ElectronicStore store, int itemId, int qty ) {
		//adding a valid product
        try {        	
        	userObj.addToCart(store, itemId, qty);
        }
        catch(NegativeQuantityException e) {
        	System.out.println("NegativeQuantityException :" + e );
        }
        catch(ZeroQuantityException e) {
        	System.out.println("ZeroQuantityException :" + e );
        }
        catch(ProductNotFoundException e) {
        	System.out.println("ProductNotFoundException :" + e );
        }
	}
	
	public static void generateBill(ElectronicStore store, User userObj) {
		try {
        	Bill billUser1 = store.generateBill(userObj);
        	System.out.println(billUser1);
        }
        catch(EmptyCartException e) {
        	System.out.println("EmptyCartException :" + e);
        }
	}
	
    public static void main(String[] args){
        ElectronicItem items[] = new ElectronicItem[4];
        items[0] = new Mobile("iphone", 98000, 1);
        items[1] = new Laptop("lenova", 70000, 2);
        items[2] = new Mobile("samsung", 57000, 3);
        items[3] = new Mobile("dell", 86000, 4);

        //creation of new electronic store
        ElectronicStore store1 = new ElectronicStore(items);
        System.out.println("Electronic store created!");
        System.out.println("Electronic store inventory!");
        store1.showInventory();
        System.out.println("-------------------------\n");
        
        //adding new item to store1 (Electronic store)
        System.out.println("Adding new item in electronic store");
        store1.addItem(new Laptop("apple air", 130000, 5));
        System.out.println("Item added\n-------------------------\n");
        
        System.out.println("Electronic store inventory!");
        store1.showInventory();
        System.out.println("-------------------------\n");
        
        //removing a item from store1 (Electronic store)
        System.out.println("Removing item from electronic store");
        store1.removeItem(2);
        System.out.println("Item removed\n-------------------------\n");
        
        System.out.println("Electronic store inventory!");
        store1.showInventory();
        System.out.println("-------------------------\n");
        
        System.out.println("Total Number of Users registered :" + User.getUserCount());
        
        //user registration
        User user1 = new User("roshan", "7719075548");
        User user2 = new User("onkar", "8888881616");
        User user3 = new User("sanket", "5566332236");
        User user4 = new User("pavan", "45664546645");
        
        System.out.println("Total Number of Users registered :" + User.getUserCount());
        
        addItemToCart(user1, store1, 1, 1);
        addItemToCart(user2, store1, 2, 1);
        addItemToCart(user3, store1, 3, 1);
        addItemToCart(user4, store1, 4, 1);
        addItemToCart(user4, store1, 44, 1);
        
        System.out.println("Total Bill generated : " + Bill.getBillCount());
        
        generateBill(store1, user1);
        generateBill(store1, user2);
        generateBill(store1, user4);
        generateBill(store1, user3);
        
        System.out.println("Total Bill generated : " + Bill.getBillCount());
        
        System.out.println("\n\n================\nfetching all the transactions of store1...");
        
        ArrayList<Bill> transaction = store1.getTransactions();
        Collections.sort(transaction);
        transaction = store1.getTransactions();
        for(Bill b: transaction) {
        	System.out.println(b);
        }
        
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        
        Comparator<Bill> comp = null;
        
        while(choice != 4) {
        	
        	System.out.println("========\nsort transactions by userName/billId/totalBill");
            System.out.println("1.user Name");
            System.out.println("2.bill Id");
            System.out.println("3.total Bill");
            System.out.println("4.exit");
            System.out.println("Choice :");
            
        	choice = scan.nextInt();
        	
        	switch(choice) {
	        	case 1: comp = new NameComparator(); break;
	        	
	        	case 2: comp = new IdComparator(); break;
	        	
	        	case 3: comp = new TotalBillComparator(); break;
	        	
	        	case 4: System.out.println("exiting..."); break;
        	}
        	
        	if(choice != 4) {
        		Collections.sort(transaction, comp);
        		transaction = store1.getTransactions();
                for(Bill b: transaction) {
                	System.out.println(b);
                }
        	}
        	
        }
        
        store1.printTransactions();
        
    }
}
