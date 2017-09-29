package com.bridgeit.Programs;

import java.util.*;

import com.bridgeit.utility.Utility;
class Permutation
{	
	public static void main(String[] args)
	{
		// to read input from keyboard
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		// to read a string 
		String str = s.nextLine();
		// to calculate length of string
   		int n = str.length();
   		// creating a object of class
   		// calling permute function to find all permutation 
    	Utility.permute(str, 0, n-1);// passing string,0 and lenght of string
    	s.close();
	}
}
