package com.hefshine.hw;
// Write a program to convert Celsius into Fahrenheit and vice versa.
public class Q6_CelToFahr {

	public static void main(String[] args) 
	{
		float c=65,f;
		
		f=(c*9/5)+32;
		System.out.println("C= "+c+" F="+f);
		
		f=150;
		c=(float) ((f-32)*0.5556);
		System.out.println("F= "+f+" C= "+c);
	}

}
