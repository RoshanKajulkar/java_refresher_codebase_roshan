package com.java.store.comparators;

import java.util.Comparator;

import com.java.store.Bill;

public class NameComparator implements Comparator<Bill>{

	@Override
	public int compare(Bill o1, Bill o2) {
		return o1.getUserName().compareTo(o2.getUserName());
	}
	
}
