package com.java.bank.service;

import com.java.bank.accounts.SavingsAccount;

public class Cashier {
	double openingCash=500000;
	double closingCash=openingCash;
						//usesA Relationship
	public void dispenseCash(SavingsAccount ref, double amountToWithdraw) {
		System.out.println("Dispensing cash...to "+ref.getName()+" "+ref.hashCode());
		ref.withdraw(amountToWithdraw);	closingCash=closingCash-amountToWithdraw;
	}
	public void printClosingCash() { System.out.println("Closing cash.."+closingCash); }
}