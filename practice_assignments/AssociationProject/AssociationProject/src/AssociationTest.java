
public class AssociationTest {

	public static void main(String[] args) {
		User user = new User();
		user.buy(Item items[]);
	}

}

class Bill {
	
}

class User implements Buy {

	
	public Bill buy(Item items[]) {
		return Store.generateBill(items);
	}
	
}

class Store {
	public static Bill generateBill(Item selectedItem[]) {
		return //bill
	}
}


class ElectronicStore extends Store { // isA
	ElectronicItem repo[]; // hasA
}

class Item {
	
}


class ElectronicItem extends Item{
	
}

class Mobile extends ElectronicItem { //isA
	
}

class Laptop extends ElectronicItem{ //isA
	
}


interface Buy{
	Bill buy(Item[]);
}

class GroceryStore extends Store { //isA
	
}