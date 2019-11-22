package com.assignment;
class SalaryException extends RuntimeException{}
public class Salary {

	public static void main(String[] args) {
		System.out.println("main  starts");
		salaryDetails(500);
		System.out.println("main ends");

	}
	static void salaryDetails(int salary)
	{
		if(salary>1000)
			System.out.println("thank you");
		else
			throw new SalaryException();
	}

}
