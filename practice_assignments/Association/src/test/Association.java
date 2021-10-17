package test;

interface WithdrawAmmount {
	void withdraw();
}

interface DepositAmount {
	void deposit();
}

class BankAccount {
	double bankBalance;
}

class SavingAccount extends BankAccount implements WithdrawAmmount , DepositAmount{
	public void withdraw() {
		System.out.println("withdrawing ...");
	}
	
	public void deposit() {
		System.out.println("depositing ...");
	}
}

class TransferAmount {
	void transfer(WithdrawAmmount src, DepositAmount trg) {
		src.withdraw();
		trg.deposit();
	}
}

class Cashier {
	
	void dispenseCash(SavingAccount acc, double amount) {
		acc.withdraw();
	}
}

public class Association {

	public static void main(String[] args) {
		
		System.out.println("Transfer initiated..");
		SavingAccount src = new SavingAccount();
		SavingAccount trg = new SavingAccount();
		TransferAmount tObj = new TransferAmount();
		tObj.transfer(src, trg);
		System.out.println("Fund Transfer completed!");
		
		Cashier cashierObj = new Cashier();
		cashierObj.dispenseCash(src, 10000);
	}

}
