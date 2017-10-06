package com.bridgeit.Programs;

import java.util.HashSet;
import java.util.Scanner;

public class Factors 
{
	public static void main(String[] args) 
	{ 
		// command-line argument
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter the number");
    	HashSet<Integer> hs = new HashSet<Integer>();
    	int number = scanner.nextInt();
    	int i=2;
    	while(number>1)
    	{
    		for (int j=0;j<i/2;j++)
    		{
    			if(number%i == 0)
    			{
    				hs.add(i);
    				number=number/i;
    			}
    			else
    				i++;
    		}
    	 }
    	for(Integer ele:hs)
    	{
    		System.out.print(ele +" ");
    	}
	}
	
}
