package com.kavin;

public class ConstructorOverloading {

	ConstructorOverloading(int n)
	{
		System.out.println("ID : "+n);
	}
	ConstructorOverloading(String n)
	{
		this(33);
		System.out.println("Name : "+n);
	}
	ConstructorOverloading(Float n)
	{
		this("kavin");
		System.out.println("Salary : "+n);
	}
	public static void main(String[] args)
	{
		
		ConstructorOverloading obj3=new ConstructorOverloading(3000.0f);
	}
}
