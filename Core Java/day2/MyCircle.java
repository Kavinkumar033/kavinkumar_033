package com.kavin;

import java.util.Scanner;

class Circle 
{
	int radius;
	
	
 void Area()
 {
	 Scanner sc=new Scanner(System.in);
  	 System.out.println("To find Area");
  	 System.out.println("Enter Radius : ");
  	 radius=sc.nextInt();
 	 System.out.println("Area of Circle : "+(3.14)*(radius*radius));
 }
 void Circumference()
 {
	 Scanner sc=new Scanner(System.in);
  	 System.out.println("To find Circumference");
  	 System.out.println("Enter Radius : ");
  	 radius=sc.nextInt();
 	 System.out.println("Circumference of Circle : "+ 2*3.14*radius);
 }
}
public class MyCircle {

	  public static void main(String args[]) {
		  System.out.println("Circle Area and Circumference  Program :");
		  Circle obj = new Circle();
		  obj.Area();
		  obj.Circumference();
   }
}
