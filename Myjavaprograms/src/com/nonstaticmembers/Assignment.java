package com.nonstaticmembers;

class A1 {
	int i;
	public char[] d;
	void initializing(int i)
	{
		this.i=i;
	}

	public static void main(String[] args) {
		A1 ob=new A1();
		ob.initializing(10);
		System.out.println(ob.i);
		

	}

}
