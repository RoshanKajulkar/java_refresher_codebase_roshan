package com.java.bank.service;

import com.java.bank.accounts.AccountStatement;

public interface WithdrawService {	
	AccountStatement withdraw(double amt); 
}