package com.nonstaticmembers;
// this keyword
class Demo5 {
	void m1() {
		System.out.println("from m1()");
		System.out.println(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from the main of Demo5");
		Demo5 x= new Demo5();
		System.out.println(x);
		x.m1();
		System.out.println("end main");
		

	}

}
