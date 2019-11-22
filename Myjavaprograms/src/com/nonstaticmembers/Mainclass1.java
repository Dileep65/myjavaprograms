package com.nonstaticmembers;

class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 ob1=new A2();
		A2 ob2=new A2();
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob1.d);
		System.out.println(ob2.d);
		ob1.d=120;
		ob2.d=12.5;
		System.out.println(ob1.d);
		System.out.println(ob2.d);
		

	}

}
