package com.bridgeit.Programs;
import java.util.Scanner;

import com.bridgeit.utility.*;
class Coupon
{
	/**
	 * @param args
	 * @author akash
	 * <p>
	 */
	public static void main(String args[]) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of coupon");
		int n = scanner.nextInt();
		int array[] = new int[n];
		Utility.random(n,array);
		System.out.println("---------------------------------------------------------------");
		Utility.distinct(array);
		scanner.close();
	}
}
