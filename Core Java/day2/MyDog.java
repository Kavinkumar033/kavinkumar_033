package com.kavin;

class Dog
{
	String name;
	String breed;
	
	Dog(String name,String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	void display()
	{
		System.out.println("Dog Name : "+name);
		System.out.println("Dog Breed : "+breed);
	}
	void Set(String name,String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	
	
}

public class MyDog {
   public static void main(String args[])
   {
	   Dog obj1=new Dog("Jacky","BullDog");
	   Dog obj2=new Dog("Jimmy","RotWiller");
	   obj1.display();
	   obj2.display();
	   System.out.println("After update");
	   obj1.Set("Jack","French Bulldog");
	   obj2.Set("Simba","German Shepherd");
	   obj1.display();
	   obj2.display();
	   
   }
}
