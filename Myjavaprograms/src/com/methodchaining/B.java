package com.methodchaining;

class B {
	int i;
	static B createObject()
	{
		B ob=new B();
		return ob;
	}
	B initialize(int i)
	{
		this.i=i;
		return this;
	}

}
