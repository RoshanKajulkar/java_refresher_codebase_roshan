package com.java.bank.service;

import com.java.bank.accounts.AccountStatement;

public interface DepositService  { 
	AccountStatement deposit(double amt); 
}

//every java interface/class must be in its own file
