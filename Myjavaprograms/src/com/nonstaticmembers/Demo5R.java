package com.nonstaticmembers;
// non static member in static contex
class Demo5R { 
	int i=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo5R ob=new Demo5R();
		int i=20;
		System.out.println(i);
		System.out.println(ob.i);
		

	}

}
