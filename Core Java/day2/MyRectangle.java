package com.kavin;

import java.util.Scanner;

class Rectangle
{
   int width,length,area,perimeter;
   
   void Area()
   {
  	 Scanner sc=new Scanner(System.in);
  	 System.out.println("To find Area");
  	 System.out.println("Enter Width : ");
  	 width=sc.nextInt();
  	 System.out.println("Enter Length : ");
 	 length=sc.nextInt();
 	 area=width*length;
 	 System.out.println("Area of Rectangle : "+area);
   }
   void Perimeter()
   {
	   System.out.println("To find Perimeter");
  	 Scanner sc=new Scanner(System.in);
  	 System.out.println("Enter Width : ");
  	 width=sc.nextInt();
  	 System.out.println("Enter Length : ");
 	 length=sc.nextInt();
 	perimeter=2*(width+length);
 	 System.out.println("Perimeter of Rectangle "+perimeter);
   }
}

 
public class MyRectangle {

	public static void main(String[] args) {
		Rectangle obj=new Rectangle();
		System.out.println("Rectangle Area and Perimeter Program :");
		obj.Area();
		obj.Perimeter();
		
	}

}
