package com.kavin;
class Employee
{
	//Variables
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	Employee(int employeeId,String employeeName,float employeeSalary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
	//Method
	void display()
	{
		System.out.println("Employee Id :" + employeeId);
		System.out.println("Employee Name :" + employeeName);
		System.out.println("Employee Salary :" + employeeSalary);
	}
}


public class MyClass {

	public static void main(String[] args) {
		Employee emp1=new Employee(30,"Teddy",30000.0f);
		emp1.display();
		Employee emp2=new Employee(33,"Kavin",30000.0f);
		emp2.display();

	}

}
