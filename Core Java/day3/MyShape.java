package com.kavin;

import java.util.Scanner;

class Shape
{
	void getArea()
	{
		System.out.println("Area of Shape");
	}
}

class Rectangle
{
	int width,length;
	void getArea()
	{
	   System.out.println("Rectangle Area");
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Width");
	   width=sc.nextInt();
	   System.out.println("Enter Length");
	   length=sc.nextInt();
	   System.out.println("Area : "+(width*length));
	   sc.close();
	}
}
public class MyShape {
	public static void main(String[] args) {
		Shape obj=new Shape();
		obj.getArea();
		Rectangle obj1=new Rectangle();
		obj1.getArea();
	}

}
