package com.bridgeit.Programs;
import com.bridgeit.utility.*;
class Coupon
{
	public static void main(String args[])
	{
		int n = 10;
		int arr[] = new int[n];
		Utility.random(n,arr);
		System.out.println("---------------------------------------------------------------");
		Utility.distinct(arr);
	}
}
