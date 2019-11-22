package com.abstractclass;

class AtmImp implements ATM {
	long balance;
	@Override
	public void deposite(long depositelAmount) {
		if(depositelAmount>0)
		{
			balance=balance+depositelAmount;
		System.out.println(balance);
		}
		else
		{
			System.out.println("invalid");
		}
	}
	@Override
	public void withdrawal(long withdrawalAmount) {
	if(withdrawalAmount<=balance)
	{
		balance=balance-withdrawalAmount;
		System.out.println(balance);
	}
	else
	{
	System.out.println("invalid");
	}	
	}

	@Override
	public long checkBalance() {
		System.out.println(balance);
		return balance;
	}

	
	

}
