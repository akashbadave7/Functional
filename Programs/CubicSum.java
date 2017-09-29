package com.bridgeit.Programs;

import java.util.*;

import com.bridgeit.utility.Utility;
class CubicSum
{
	public static void main(String args[])
	{
		Utility u = new Utility();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0 ; i<a.length; i++)
		{
			a[i] = s.nextInt();
		}
		int count = u.find(a);
		System.out.println("Number of distinct triplets : "+count);	
		s.close();
	}
}
