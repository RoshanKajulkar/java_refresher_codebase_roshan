package com.java.bank.accounts;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.java.bank.service.DepositService;
import com.java.bank.service.WithdrawService;

public class SavingsAccount extends BankAccount implements WithdrawService,DepositService
{
	private int accNo;
	private String name;
	private double accBalance;
	List<AccountStatement> accountStatementList;

	public SavingsAccount() {
		
	}
	
	public SavingsAccount(int accNo, String name, double accBalance) {
		super(); //default line of each ctor..
		this.accNo = accNo;
		this.name = name;
		this.accBalance = accBalance;
		accountStatementList = new ArrayList<AccountStatement>();
	}
	
	
	@Override
	public String toString() {
		return "SavingsAccount [accNo=" + accNo + ", name=" + name + ", accBalance=" + accBalance + "]";
	}

	public String getName() {
		return name;
	}
	
	public AccountStatement withdraw(double amt) { 
		System.out.println("withdraw..."+amt);	
		accBalance=accBalance - amt;
		
		AccountStatement theStatement = new AccountStatement();
		theStatement.setTransactionAmount(amt);
		theStatement.setTransactionType("Dt.");
		theStatement.setTransactionNumber(accNo+(int)amt); //some random
		theStatement.setDescription("Cash withdrawn");
		theStatement.setTransactionDate(LocalDateTime.now());
		return theStatement;
	} 
	
	public AccountStatement deposit(double amt)  { 
		
		System.out.println("deposit...."+amt); 
		accBalance=accBalance + amt;
		AccountStatement theStatement = new AccountStatement();
		theStatement.setTransactionAmount(amt);
		theStatement.setTransactionType("Cr.");
		theStatement.setTransactionNumber(accNo+(int)amt); //some random
		theStatement.setDescription("Cash Deposited");
		theStatement.setTransactionDate(LocalDateTime.now());
		return theStatement;
	}
}