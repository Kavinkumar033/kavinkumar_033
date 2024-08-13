package com.kavin;

 class Person
{
  	String name;
  	int age;
  	Person(String name,int age)
  	{
  		this.name=name;
  		this.age=age;
  		System.out.println("Name: "+name+" Age : "+age);
  	}
  
}

public class MyPerson {

	public static void main(String[] args) {
		 Person obj1=new Person("Kavin",19);
		 Person obj2=new Person("Kumar",20);
		 
	}

}
