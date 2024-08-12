package com.kavin;

public class MethodOverloading {
	void  Overload(int n)
	{
		System.out.println("ID : "+n);
	}
	void  Overload(String n)
	{
		System.out.println("Name : "+n);
	}
	void  Overload(Float n)
	{
		System.out.println("Salary : "+n);
	}
	public static void main(String[] args)
	{
		MethodOverloading obj=new MethodOverloading();
		obj.Overload(33);
		obj.Overload("Kavin");
		obj.Overload(30000.0f);
	}
}
