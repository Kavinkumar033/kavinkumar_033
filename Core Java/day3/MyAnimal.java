package com.kavin;



class Animal
{
	void makeSound()
	{
       System.out.println("Animal Sound");		
	}
}
class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("Cat Sound 'Meow'");
	}
}
public class MyAnimal {

	public static void main(String[] args) {
		
		Animal obj=new Animal();
		obj.makeSound();
		Cat obj1=new Cat();
		obj1.makeSound();

	}

}
