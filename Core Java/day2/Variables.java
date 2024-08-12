package com.kavin;


public class Variables {
	int b=20;//instance or object variable 
	static int c=30;//static  or class variable
	public static void main(String[] args) {
		//Local variable 
		int a=10;
		System.out.println("Local Variable : "+ a);
		Variables obj=new Variables();
		System.out.println("instance : "+obj.b);
		System.out.println("class variable : "+Variables.c);
        
	}

}
