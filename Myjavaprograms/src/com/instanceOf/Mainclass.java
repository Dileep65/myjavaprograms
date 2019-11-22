package com.instanceOf;

class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A ob1=new B();
System.out.println(ob1 instanceof B);
System.out.println(ob1 instanceof A);

B ob2=new B();
System.out.println(ob2 instanceof B);
System.out.println(ob2 instanceof A);

A ob3=new A();
System.out.println(ob3 instanceof B);
System.out.println(ob3 instanceof A);
	}
	

}
