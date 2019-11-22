package com.abstractclass;

class Rectangle extends Shape {
	int b;
	int l;
 Rectangle() {
		// TODO Auto-generated constructor stub
	}
 Rectangle(int l,int b)
 {
	 this.l=l;
	 this.b=b;
 }
 double area()
 {
	 return(l*b);
 }
	

}
