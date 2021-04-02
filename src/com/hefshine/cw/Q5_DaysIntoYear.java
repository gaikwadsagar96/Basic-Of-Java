package com.hefshine.cw;
//Write a program to convert days into years, weeks and days.{Hint: Input-373 days Output-1Year,1Weak,1day}
public class Q5_DaysIntoYear {

	public static void main(String[] args) 
	{
		int d=375,year,week;
		year=d/365;
		d=d%365;
		week=d/7;
		d=d%7;
		System.out.println("year: "+year+" week : "+week+" days: "+d);
		

	}

}
