package com.encapsulation;

class EmployeePortal {
	public static void main(String[] args) {
		Employee emp=new Employee(1, "Dileep",25002);
		System.out.println("employee id is "+emp.getId());
		System.out.println("employee name is "+emp.getName());
		System.out.println("employee salary is "+emp.getSalary());
		emp.setSalary(30000);
		System.out.println("employee salary is ."+emp.getSalary());
		
	}

}
