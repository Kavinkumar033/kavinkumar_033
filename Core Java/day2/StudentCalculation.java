package com.kavin;

import java.util.Scanner;

import javax.sound.midi.Soundbank;
import javax.xml.transform.sax.SAXSource;

class student
{
	int RegNo;
	String stuName;
	int arr[]= new int[5];
	int sum=0;
	float Avg;
	student(int no,String name)
	{ 
		RegNo=no;
		this.stuName=name;
	}
	void GetMarks()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Marks : ");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
	}
	void CalculateGrade()
	{
		for(int i=0;i<5;i++)
		{
			sum=sum+arr[i];
		}
		Avg=sum/5;
		
	}
	
	void display() {
		System.out.println("Name : "+stuName);
		System.out.println("ID : "+RegNo);
		System.out.println("Sum of Marks : "+sum+"/500");
		System.out.println("Average of Marks : "+Avg);
		if(Avg>=90)
		{
		  System.out.println("Grade:A");
		}
		 if (Avg>80 && Avg<90) {
			System.out.println("Grade:B");
		}
		if(Avg>70 && Avg<80) {
			System.out.println("Grade:C");
		}
		if(Avg>50 && Avg<70)
		{
			System.out.println("Grade:D");
		}
		if(Avg<50)
		{
			System.out.println("Fail");
		}
	}
	
}
public class StudentCalculation {
	public static void main(String[] args)
	{
		student obj=new student(33,"Kavin");
		obj.GetMarks();
		obj.CalculateGrade();
		obj.display();
	}
}
