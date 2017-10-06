package com.bridgeit.Programs;

import java.util.*;

import com.bridgeit.utility.Utility;
class CubicSum
{
	public static void main(String args[])
	{
		Utility utiliy = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n = scanner.nextInt();
		int array[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0 ; i<array.length; i++)
		{
			Integer element = scanner.nextInt();
			array[i] = element;
		}
		Integer count = utiliy.find(array);
		System.out.println("Number of distinct triplets : "+count);	
		scanner.close();
	}
}
