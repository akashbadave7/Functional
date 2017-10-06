package com.bridgeit.Programs;

import java.util.*;
class StopWatch
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner (System.in);
		double start,end,elapsed;
		start = System.currentTimeMillis();//to start timer
		System.out.println("Enter your First name");
		String name = scanner.nextLine();
		System.out.println("Enter your last name");
		String lname = scanner.nextLine();
		
		System.out.println("Hello "+name+" " +lname);
		end = System.currentTimeMillis();//to end timer
		elapsed = (end - start)/1000;
		System.out.println("Elapsed time is "+elapsed+" s");//to find elapsed time


	}
}
