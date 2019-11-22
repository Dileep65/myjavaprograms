package com.constructoroverloading;

class Demo5 {
	Demo5()
	{
		System.out.println("hi");
	}
	Demo5(int i)
	{System.out.println("bro");
	}
	Demo5(int i,double j)
	{
		System.out.println("bye");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo5 ob1=new Demo5();
		Demo5  ob2=new Demo5(10);
		Demo5 ob3=new Demo5(10,12.5);

	}

}
