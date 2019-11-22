package com.staticmembers;

class Demo5 {
	static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=20;
		System.out.println(i);
		System.out.println(Demo5.i);
		m1();
		System.out.println(Demo5.i);

	}
	static void m1()
	{
		System.out.println(i);
		i=10;

}

}
