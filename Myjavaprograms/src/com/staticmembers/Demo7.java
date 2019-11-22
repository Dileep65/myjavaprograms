package com.staticmembers;

class Demo7 {
	static void m1()
	{
		System.out.println("for static method m1 of demo7");
		}
public static void main(String[] args) {
		m1();
		Demo7.m1();

	}

}
