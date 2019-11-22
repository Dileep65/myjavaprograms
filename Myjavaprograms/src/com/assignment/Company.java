package com.assignment;

class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee();
e1.name="yash";
e1.id=22;
e1.salary=25000;
Employee e2=new Employee("dileep",23,30000);
System.out.println("name:"+e1.name+" "+"id:"+e1.id+" "+"salary:"+e1.salary);
System.out.println("name:"+e2.name+" "+"id:"+e2.id+" "+"salary:"+e2.salary);
	}

}
