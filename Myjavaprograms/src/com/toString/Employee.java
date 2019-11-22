package com.toString;

class Employee {
	int id;
	String name;
	double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	Employee(int id, String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return id+" "+name+" "+salary;
	}
	
	public int hashCode()
	{
		int hs=id+(int)salary+name.hashCode();
		return hs;
	}

}
