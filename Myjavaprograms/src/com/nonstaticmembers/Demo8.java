package com.nonstaticmembers;

class Demo8 {
	int i=10;
	void test() {
		i=20;
		System.out.println(i);
		System.out.println(this.i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo8 x= new Demo8();
		System.out.println(x.i);
		x.test();
	}
}
