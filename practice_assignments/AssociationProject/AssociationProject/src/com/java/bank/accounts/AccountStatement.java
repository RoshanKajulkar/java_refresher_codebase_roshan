package com.java.bank.accounts;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AccountStatement {
	
	private int transactionNumber;
	private LocalDateTime transactionDate;
	private String transactionType; //credit/debit
	private double transactionAmount;
	private String description;
	
	public int getTransactionNumber() {
		return transactionNumber;
	}
	public void setTransactionNumber(int transactionNumber) {
		this.transactionNumber = transactionNumber;
	}
	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "AccountStatement [transactionNumber=" + transactionNumber + ", transactionDate=" + transactionDate
				+ ", transactionType=" + transactionType + ", transactionAmount=" + transactionAmount + ", description="
				+ description + "]";
	}
	
	
	
	
}
