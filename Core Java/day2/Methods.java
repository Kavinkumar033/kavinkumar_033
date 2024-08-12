package com.kavin;

public class Methods {
	void Method1()//instance method
	{
		System.out.println("Instance Method");
	}
	static void Method2()//static method
	{
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Methods obj=new Methods();
         obj.Method1();
         Methods.Method2();
	}

}
