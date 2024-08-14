package com.kavin;

class Animal1
{
	void Move()
	{
		System.out.println("Animals Move...");
	}
}

class Cheetah
{
	void Move() {
		System.out.println("Cheetah is Running....");
	}
}
public class MyAnimal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 obj = new Animal1();
		obj.Move();
		Cheetah obj1 =new Cheetah();
		obj1.Move();
	}

}
