package com.abstractclass;

class Main1 {

	public static void main(String[] args) {
	Dog d=new Dog(10,20);
	System.out.println(d.height);
	System.out.println(d.weight);
	d.talk();
	Lion l=new Lion(20.2,25);
	System.out.println(l.height);
	System.out.println(l.weight);
	l.talk();

	}

}
