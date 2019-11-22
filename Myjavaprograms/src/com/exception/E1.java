package com.exception;

class E1 {
	public static void main(String[] args) {
		System.out.println("main starts");
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);//Arithmeticexception
	}

}
