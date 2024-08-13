package com.kavin;

import org.w3c.dom.ls.LSOutput;

//Single Inheritance

/*class TwoWheeler
{
	void NoOfWheels()
	{
		System.out.println("Two Wheels Having");	
	}
	
}
class Brand extends TwoWheeler {

		void BrandName()
		{
			System.out.println("Brand Name is KTM");
		}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brand obj=new Brand();
		obj.NoOfWheels();
		obj.BrandName();

	}
	}
	*/
// MULTILEVEL INHERITANCE
//
//class Vehicle
//{
//	void Engine()
//	{
//		System.out.println("Have one Engine ");
//	}
//}
//class Wheeler extends Vehicle
//{
//	void NoOfWheels()
//	{
//		System.out.println("Two Wheels Having");	
//	}
//	
//}
//class brand extends Wheeler {
//
//		void BrandName()
//		{
//			System.out.println("Brand Name is KTM");
//		}
//}
//
//
//public class Inheritance {
//
//	public static void main(String[] args) {
//		brand obj=new brand();
//		obj.BrandName();
//		obj.NoOfWheels();
//		obj.Engine();
// 
//	}
//
//}

//Hierarical
class Vehicle
{
	void Engine()
	{
		System.out.println("Have one Engine ");
	}
}
class TwoWheeler extends Vehicle
{
	void wheels()
	{
		System.out.println("It has Two Wheels");
	}
	
}

class Bike extends TwoWheeler
{
	void BrandName()
	{
		System.out.println("Brand Name KTM");
	}
}

class Scooty extends TwoWheeler
{
	void BrandName()
	{
		System.out.println("Brand Name Activa");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Bike obj=new Bike();
		obj.BrandName();
		obj.wheels();
		obj.Engine();
		System.out.println();
		Scooty obj1=new Scooty();
		obj1.BrandName();
		obj1.wheels();
		obj1.Engine();

	}

}

