package com.upcasting;

class Mainclass2 {

	public static void main(String[] args) {
		B ob1=new C();
		A ob2=new C();
		System.out.println(ob1.i);
		System.out.println(ob1.j);
		System.out.println(ob2.i);
		//System.out.println(ob2.j);
		A ob3= ob1;
		System.out.println(ob3.i);

	}

}
