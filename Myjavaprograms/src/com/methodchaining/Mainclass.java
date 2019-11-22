package com.methodchaining;

class Mainclass {

	public static void main(String[] args) {
	B ob= B.createObject();
	ob.initialize(10);
	System.out.println("+++++++++");
	B ob2=B.createObject().initialize(15);

	}

}
