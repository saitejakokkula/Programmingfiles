package com.slokam;

public class Test2 {

	public static void main(String[] args) {
		
		Bank b = new UBI();
		System.out.println("Rate of Interest is:"+b.RateOfInterest() +" %");
		b.m2();
		System.out.println("---------------------------------------------");
		Bank b1 = new SBI();
		System.out.println("Rate of Interest is:"+b1.RateOfInterest() +" %");

	}

}
