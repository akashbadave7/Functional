package com.bridgeit.Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args) 
	{ 
		// command-line argument
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter the number");
    	int number = scanner.nextInt();
    	if(number%2==0)
    	{
    		System.out.println(2);
    		number%= 2;
    	}
    	for (int i=3;i<number;i+=2)
    	{
    		
    	}
	}
	private static void input(int row, int column) 
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList array = new ArrayList();
		array.add(scanner.next());
	}
	
}
