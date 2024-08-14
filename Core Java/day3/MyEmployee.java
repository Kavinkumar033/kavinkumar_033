package com.kavin;

class Employee
{
	void work()
	{
		System.out.println("Employee Working");
	}
	double getSalary()
	{
		return 30000.00;
	}
}

class HRManager extends Employee
{
	@Override
  	void work()
  	{
  		System.out.println("HR Manager is working ..");
  	}
  	void addEmployee()
  	{
  		System.out.println("Hr Manager is addind Employee");
  	}
}
public class MyEmployee {

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.work();
		System.out.println("Default Salary : "+obj.getSalary());
		HRManager obj1 = new HRManager();
		obj1.work();
		obj1.addEmployee();
		
	}

}
