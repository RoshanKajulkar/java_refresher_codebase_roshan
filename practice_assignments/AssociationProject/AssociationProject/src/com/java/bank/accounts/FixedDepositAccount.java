package com.java.bank.accounts;

public class FixedDepositAccount extends SavingsAccount {
	void calculateMaturityPeriod() { //1. exclusive method
		super.withdraw(5000); //2. inherited method
	}
}