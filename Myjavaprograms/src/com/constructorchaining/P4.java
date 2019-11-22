package com.constructorchaining;

 class P4 {
	 {
		 System.out.println("from IIB");
		 
	 }
	 P4()
	 {
		 System.out.println("from P4()");
		 
	 }
	 P4(int i)
	 {
		 this();
		 System.out.println("from P4(int i)");
		 
	 }
	 P4(float f)
	 {
		 
		 System.out.println();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P4 ob1=new P4();
		System.out.println("****");
		P4 ob2=new P4(10.5f);
		

	}

}
