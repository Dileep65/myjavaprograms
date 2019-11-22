 package com.instanceinitializerblock;

class P1 {
	{
		System.out.println("from IIB1");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1 ob1=new P1();
		System.out.println("****");
		P1 ob2=new P1();
		}
	{
		System.out.println("from IIB2");
	}

}
