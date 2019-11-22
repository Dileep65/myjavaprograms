package com.nonstaticmembers;

class Demo7 {
	int i;
	void test() {
		System.out.println(i);
		i=20;
		System.out.println(this.i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo7 x= new Demo7();
		System.out.println(x.i);
		x.test();
		System.out.println("end main");
	}
		



}
