package com.nonstaticmembers;

class Masterclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 ob1=new A2();
		B ob2=new B();
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob1.d);
		System.out.println(ob2.d);
		ob1.d=12;
		ob2.d=13;
		System.out.println(ob1.d);
		System.out.println(ob2.d);
		

	}

}
