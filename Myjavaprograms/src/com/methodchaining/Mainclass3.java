package com.methodchaining;

public class Mainclass3 {

	public static void main(String[] args) {
	Employee e1=Employee.createemployee("Dileep", 25000).display();
	e1.initialise(50000).display();
	Employee.createemployee("yash", 2000000).display().initialise(2500).display();

	}

}
