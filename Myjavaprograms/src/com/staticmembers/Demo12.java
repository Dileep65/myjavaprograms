package com.staticmembers;

class Demo12 {
	static int j;
	static

	{
		System.out.println("from sib of Demo12");
	}

	public static void main(String[] args) {
		System.out.println("from main of Demo12");
		System.out.println(Demo11.i);
	
}

}

