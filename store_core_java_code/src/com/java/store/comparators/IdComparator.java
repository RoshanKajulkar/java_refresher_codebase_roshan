package com.java.store.comparators;

import java.util.Comparator;

import com.java.store.Bill;

public class IdComparator implements Comparator<Bill>{

	@Override
	public int compare(Bill o1, Bill o2) {
		return Integer.compare(o1.getBillId(), o2.getBillId());
	}
}
