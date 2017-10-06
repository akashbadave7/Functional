package com.bridgeit.Programs;

import com.bridgeit.utility.*;
import java.io.*;
import java.util.Scanner;


public class Array
{
	public static void main(String args[])
	{	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter row size");
		int row = scanner.nextInt();
		System.out.println("Enter column size");
		int column = scanner.nextInt();

		System.out.println("Enter user choice");
		System.out.println("1. Integer");
		System.out.println("2. String");
		System.out.println("3. Double");
		int choice = scanner.nextInt();
		Utility.input(row,column,choice);
	}
}
