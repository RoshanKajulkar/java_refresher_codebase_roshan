package com.java.bank.service;

public class FundsTransfer
{
	public void fundsTransferService(WithdrawService src, DepositService trg, double amountToTransfer) {
		System.out.println("Transferring funds...");
		src.withdraw(amountToTransfer);
		trg.deposit(amountToTransfer);
		
		
		System.out.println("--- Transfer successfull ---");
	}
}
