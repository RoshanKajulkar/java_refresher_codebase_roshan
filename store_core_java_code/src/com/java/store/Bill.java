package com.java.store;

import java.time.LocalDateTime;

final public class Bill implements Comparable<Bill> {
	private static int billCount;
	private String userName;
	private String userNumber;
	private double totalBill;
	private LocalDateTime transactionTime;
	
	private final int billId;

	public int compareTo(Bill o) {
		
		return Integer.compare(billId, o.billId);
	}
	
	public LocalDateTime getTransactionTime() {
		return transactionTime;
	}

	public String getUserName() {
		return userName;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public int getBillId() {
		return billId;
	}

	public Bill(String userName, String userNumber, double totalBill) {
		System.out.println("generating new bill!");
		System.out.println("Bill generated");
		billCount++;
		
		int randomNumber = (int) (Math.random()*100000);
		billId = randomNumber;
		
		this.userName = userName;
		this.userNumber = userNumber;
		this.totalBill = totalBill;
		transactionTime = LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		return "Bill [userName=" + userName + ", userNumber=" + userNumber + ", totalBill=" + totalBill
				+ ", transactionTime=" + transactionTime + ", billId=" + billId + "]";
	}

	public static int getBillCount() {
		return billCount;
	}
}
