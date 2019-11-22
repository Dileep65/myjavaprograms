package com.methodchaining;

class Mainclass2 {

	public static void main(String[] args) {
		D ob=D.objectCreation();
		ob.initialise(10, 25.5, 10>25);
		ob.display();
		System.out.println("++++++++");
		D.objectCreation().initialise(11, 25.95, 25<55).display();

	}

}
