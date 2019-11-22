package com.methodchaining;

class Employee {
	int id;
	String name;
	int salary;
	static int x;
	{
		++x;
		id=x;
	}
	Employee(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
		
		
	}
	static Employee createemployee(String name,int salary)
	{
		return new Employee(name,salary);
	}
	Employee initialise(int salary)
	{
		this.salary=salary;
		return this;
	}
	Employee display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(this.salary);
		System.out.println("*********");
		return this;
	}

}
