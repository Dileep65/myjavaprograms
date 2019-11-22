package com.constructoroverloading;

class P1 {
	int i;
	P1()
	{
		System.out.println(this);
	}
	public static void main(String[] args) {
		P1 on1=new P1();
		System.out.println(on1);
		System.out.println("**********");
		P1 on2=new P1();
		System.out.println(on2);

	}

}
