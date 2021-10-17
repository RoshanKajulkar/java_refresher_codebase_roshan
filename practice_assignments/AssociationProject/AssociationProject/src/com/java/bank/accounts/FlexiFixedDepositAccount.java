package com.java.bank.accounts;

public class FlexiFixedDepositAccount extends FixedDepositAccount {
	
	void calculateFlexiTerms() { //1. exclusive method
		super.calculateMaturityPeriod(); // 2. inherited method
	}
}