package com.slokam;

public class SBI extends Bank {

	public SBI() {
		System.out.println("SBI statement");
	}
	@Override
	public int RateOfInterest() {
		return 7;
	}
}
