package com.abstractclass;

abstract class Animal {
	double height;
	double weight;
   Animal() {
		// TODO Auto-generated constructor stub
	}
   Animal(double height, double weight)
   {
	   this.height=height;
	   this.weight=weight;
   }
   abstract void talk();
   

}
