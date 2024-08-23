package com.slokam;

public class UBI extends Bank {

	public UBI() {
		System.out.println("UBI statement");
	}
	@Override
	public int RateOfInterest() {
		return 5;
	}

}
