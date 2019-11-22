package com.upcasting;

class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1=new B();
		System.out.println(ob1.i); 
	//	System.out.println(ob1.j); //using parent ref. variable we can't access members of child class
		
		B ob2=new B();
		System.out.println(ob2.i);
		System.out.println(ob2.j);
		
		A ob3=ob2;
		System.out.println(ob3.i);
		

	}

}
