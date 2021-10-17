package com.java.bank;

import java.time.LocalDate;

import com.java.bank.accounts.AccountStatement;
import com.java.bank.accounts.SavingsAccount;
import com.java.bank.service.Cashier;
import com.java.bank.service.FundsTransfer;

public class AssociationTest {
	public static void main(String[] args) {

		SavingsAccount source = new SavingsAccount(101,"Julie",50000);
		System.out.println("Source "+source);
		
		AccountStatement singleStatement1 = source.withdraw(3000);
		System.out.println("Single Statement : "+singleStatement1);
		
		AccountStatement singleStatement2 = source.withdraw(4000);
		System.out.println("Single Statement : "+singleStatement2);
		
		AccountStatement singleStatement3 = source.withdraw(9000);
		System.out.println("Single Statement : "+singleStatement3);
		
		AccountStatement singleStatement4 =source.deposit(30000);
		System.out.println("Single Statement : "+singleStatement4);
		
		
		System.out.println("Source "+source);
		
		
		//SavingsAccount source = new SavingsAccount(101,"Julie",50000);
	
		/*AccountStatement singleStatement = new AccountStatement();
		
		singleStatement.setTransactionNumber(1);
		singleStatement.setTransactionDate(LocalDate.now());
		singleStatement.setTransactionAmount(5000);
		singleStatement.setTransactionType("Cr.");
		singleStatement.setDescription("Salary Credited");
		
		
		System.out.println("Single Statement : "+singleStatement);
		
		System.out.println("=============");
		//just 5 references, and not the objects
		AccountStatement statementArray[] = new AccountStatement[5];
		double amountToTransact=5000;
		
		for(int i=0;i<statementArray.length;i++) {
			statementArray[i] = new AccountStatement(); //instantiate the first obj
			
			statementArray[i].setTransactionNumber(i+1);
			statementArray[i].setTransactionDate(LocalDate.now());
			statementArray[i].setTransactionAmount(amountToTransact);
			
			if(i%2==0) {
				statementArray[i].setTransactionType("Cr.");
				statementArray[i].setDescription("Amount Credited");
				amountToTransact=amountToTransact+500;

			}
			else {
				statementArray[i].setTransactionType("Dt.");
				statementArray[i].setDescription("Amount Debited");
				amountToTransact=amountToTransact-400;
			}
			
			System.out.println("Statement : "+statementArray[i]);
				
		}*/
		
		
		/*SavingsAccount ref = source;
		ref.withdraw(5000);
		
		SavingsAccount ref2 = ref;
		ref2.withdraw(5000);
		
		System.out.println("HashCode of source : "+source.hashCode());
		System.out.println("HashCode of ref    : "+ref.hashCode());
		System.out.println("HashCode of ref2   : "+ref2.hashCode());
		
		
		SavingsAccount target = new SavingsAccount(102,"Jane",60000);
		
		System.out.println("source : "+source);
		System.out.println("target : "+target);
		
		FundsTransfer fundsTransfer = new FundsTransfer();
		fundsTransfer.fundsTransferService(source, target,5000);
		

		System.out.println("source : "+source);
		System.out.println("target : "+target);
		
		Cashier theCashier = new Cashier(); theCashier.printClosingCash();
		theCashier.dispenseCash(source, 10000);
		theCashier.dispenseCash(target, 20000);
		theCashier.printClosingCash();
		

		System.out.println("source : "+source);
		System.out.println("target : "+target);
		
/*
 * //object slicing 
//WithdrawService src = new SavingsAccount(); //source
//DepositService  trg  = new SavingsAccount(); //target 

 * 		BankAccount baObj = new BankAccount();
		

		if(baObj instanceof SavingsAccount) {
			System.out.println("Yes, its refering to a SavingsAccount");
		} else {
			System.out.println("No, its not refering to a SavingsAccount");
					
		}
		
		if(baObj instanceof BankAccount) {
			System.out.println("Yes, its refering to a BankAccount");
		}
		
		System.out.println("==============");
		
		SavingsAccount saObj = new SavingsAccount();
		
		
		if(saObj instanceof SavingsAccount) {
			System.out.println("Yes, its refering to a SavingsAccount");
		}
		
		if(saObj instanceof BankAccount) {
			System.out.println("Yes, its also refering to a BankAccount");
		}
		
		Chess myChess = new Chess ();
		myChess.moveBishop(); // early binding....Chess's moveBishop is bound with myChess
		
		myChess = new MagnetBasedChess();
		myChess.moveBishop(); // early binding....Chess's moveBishop is bound with myChess
		//but at runtime, the binding will change, it will pikcup MagnetBasedChess's moveBishop();
		//Runtime Type Identification - java reflection API
		
		myChess = new WoodenBasedChess();
		myChess.moveBishop(); //  early binding...Chess's moveBishop() is bound 
		*/
		//MagnetBasedChess magnetChess = new MagnetBasedChess();
		//magnetChess.moveBishop();
	}
}
