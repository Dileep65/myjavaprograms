package com.nonstaticmembers;
// non static method in non static contex
public class Demo6 {
	void m1() {
		System.out.println("from m1()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from the main of Demo5");
		Demo6 x= new Demo6();
		x.m1();
		
	}}
