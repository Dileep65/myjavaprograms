package com.abstractclass;

class Main2 {

	public static void main(String[] args) {
		Shape s;
		s=new Circle(10);
		System.out.println(s.area());
		s= new Rectangle(19, 6);
		System.out.println(s.area());
		System.out.println(((Rectangle)s).b);
		System.out.println(((Rectangle)s).l);
		
		

	}

}
