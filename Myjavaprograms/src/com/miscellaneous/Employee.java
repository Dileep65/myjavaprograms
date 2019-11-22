package com.miscellaneous;

class Employee {
	String empId;
	String name;
	int salary;
	static int x;
	{
		++x;
		empId="TYC"+x;
	}
	Employee(String name, int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	static Employee createEmployee(String name, int salary)
	{
		return new Employee( name,   salary);
	}
    Employee initialise(int salary)
    {
    	this.salary=salary;
    	return this; 
    }
    Employee display()
    {
    	System.out.println(this.empId);
    	System.out.println(this.name);
    	System.out.println(this.salary);
    	System.out.println("-------------------");
    	return this;
    }
    public static void main(String[] args) {
		Employee emp=Employee.createEmployee("Dileep", 20000).display();
		emp.initialise(28000).display();
		Employee.createEmployee("Subbu", 19000).display().initialise(25000).display();
	}
}
