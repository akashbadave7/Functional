package com.bridgeit.Programs;

import com.bridgeit.utility.Utility;

class LeapYear
{
	public static void main(String args[])
	{
		try
		{
			new Utility();
			int year = Integer.parseInt(args[0]);
			// checking weather year is 4 digit
			boolean res =  false;
			if(year >999)
			{	// to find weather it is leap year
				res = Utility.checkLeapYear(year);
			}
			else
			{
				System.out.println("Enter the year in four digit");
				return;
			}
			if(res==true)
			{
				System.out.println("Year is leap year.");
			}
			else
			{
				System.out.println("Year is not leap year.");
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter command line argument.");
		}
		
	}
}
