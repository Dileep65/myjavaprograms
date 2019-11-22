package com.polymorphism;

class Main1 {

	public static void main(String[] args) {
		Bank bank;
		bank=new ICICI();
		System.out.println(bank.rateOfInterest());
		bank=new Canara();
		System.out.println(bank.rateOfInterest());
		bank=new SBIInTouch();
		System.out.println(bank.rateOfInterest());
		bank=new SBI();
		System.out.println(bank.rateOfInterest());
		// TODO Auto-generated method stub

	}

}
