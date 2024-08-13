package com.kavin;


class A
{
	A(String name)
	{
		System.out.println("Welcome "+name);
	}
	int a=10;
	void Method1()
	{
		System.out.println("I am Super Class");
	}
}

class B extends A
{
	B()
	{
		super("Kavin");
	}
	void Method2()
	{
		System.out.println("Super Class Variable :"+super.a);
		super.Method1();
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.Method2();

	}

}
