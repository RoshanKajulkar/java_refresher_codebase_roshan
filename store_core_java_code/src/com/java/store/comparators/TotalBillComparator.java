package com.java.store.comparators;

import java.util.Comparator;

import com.java.store.Bill;

public class TotalBillComparator implements Comparator<Bill>{

	@Override
	public int compare(Bill o1, Bill o2) {
		return Double.compare(o1.getTotalBill(), o2.getTotalBill());
	}
}
