package com.constructoroverloading;

public class P2 {
	int i=10;
	double d=12.0;
	P2()
	{
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(this.i);
		System.out.println(this.d);
	}
	public static void main(String[] args) {
		System.out.println("main starts");
		P2 on1=new P2();
		System.out.println(on1.i);
		System.out.println(on1.d);

	}

}

