package com.bridgeit.Programs;

import com.bridgeit.utility.*;
import java.io.*;
import java.util.Scanner;


class Array
{
	public static void main(String args[])
	{	
		// to read size of row and col as coomand line argument
		int row = Integer.parseInt(args[0]);
		int col = Integer.parseInt(args[1]);
		Scanner s = new Scanner(System.in);
		// to print the element
		PrintWriter p = new PrintWriter(System.out);
		// creating an array of size [row*col]		
		int arr[][] = new int[row][col];
		p.println("Enter array Elements:");
		p.flush();
		Utility.readArrayElement(arr,row,col);
		p.println("Array element are:");
		p.flush();
		//printing array element
		Utility.printArrayElement(arr,row,col);
		p.close();
		System.out.println();
		s.close();
	}
}
