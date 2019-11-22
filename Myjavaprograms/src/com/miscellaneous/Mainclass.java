package com.miscellaneous;

class Mainclass {
	static void displaying(A ob)
	 {
		 System.out.println(ob.i);
		 System.out.println(ob.j);
		 
	 }
	public static void main(String[] args)
	{
		A ob1=new A(10,10.2);
		A ob2=new A(1000,10.23);
		displaying(ob1);
		displaying(ob2);
		
		
	}

}
