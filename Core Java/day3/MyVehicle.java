package com.kavin;


class Vehicle
{
	void drive()
	{
		System.out.println("Repairing a Vehicle");
	}
}

class car extends Vehicle
{
	@Override
	void drive()
	{
		System.out.println("Repairing a Car");
	}
}
public class MyVehicle {

	public static void main(String[] args) {
		Vehicle obj = new Vehicle();
		obj.drive();
		car obj1=new car();
		obj1.drive();

	}

}
