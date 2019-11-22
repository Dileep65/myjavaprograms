package com.abstractclass;

 class Circle extends Shape {
	int r;
	Circle()
	{}
	Circle(int r)
	{
		this.r=r;
	}
 double area()
	{
		return(PI*r*r);
		
	}
	

}
