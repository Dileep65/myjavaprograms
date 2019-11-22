package com.toString;

public class B2 extends A2 {
	char ch;
	String s;
	B2(){}
	
	B2(int i,double j,char ch,String s)
	{
		super(i,j);
		 this.ch=ch;
		 this.s=s;
		 
	}
	public String toString()
	{
		return super.toString()+" "+ch+" "+s;
	}


}
