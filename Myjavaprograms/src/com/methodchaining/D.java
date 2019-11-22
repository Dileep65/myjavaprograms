package com.methodchaining;

class D {
	int i;
	double d;
	boolean b;
	static D objectCreation()
	{
		return new D();
	}
	D initialise(int i,double d,boolean b)
	{
		this.i=i;
		this.d=d;
		this.b=b;
		return this;
	}
	D display()
	{
		System.out.println(i);
		System.out.println(d);
		System.out.println(b);
		return this;
	}
	

	}
