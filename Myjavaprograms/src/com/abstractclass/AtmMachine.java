package com.abstractclass;

public class AtmMachine {

	public static void main(String[] args) {
       ATM atm=new AtmImp();
       atm.deposite(1001);
       atm.withdrawal(201);
       atm.checkBalance();

	}

}
