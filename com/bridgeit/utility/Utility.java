package com.bridgeit.utility;

import java.io.PrintWriter;
import java.util.Scanner;

public class Utility 
{
	//2DARRAY
	public static void printArrayElement(int[][] arr, int row, int col) 
	{
		PrintWriter p = new PrintWriter(System.out);
		for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                    p.print(arr[i][j]+" ");
            }
            p.println();
        }
		
	}
	public static void readArrayElement(int[][] arr,int row,int col)
	{
		Scanner s = new Scanner(System.in);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		
	}
	
	//COUPON PROGRAM
	

	// to generate random coupon number
	public static void random(int n,int arr[])
	{
		for(int i=0 ; i<n ; i++)
		{
			int num =(int) (Math.random()*n);
			arr[i]=num;
			
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+ " ");
		}
		System.out.println();
	}


	// to eliminate duplicate coupon number and print unique coupon number

	public static void distinct(int arr[])
	{
		for (int i = 0; i < arr.length; i++) 
		{
        		boolean found = false;
        		for (int j = 0; j < i; j++)
            		if (arr[i] == arr[j]) 
			{
                		found = true;
               			break;
            		}
        		if (!found)
            		System.out.print(arr[i]+" ");
    		}
		System.out.println();
	}
	
	//PARMUTATION
	public static void permute(String str, int l, int r)
	{	//if string lenth is 1
    	if (l == r)
        		System.out.println(str);
    	else
    	{	
    		for (int i = l; i <= r; i++)
    		{
        		str = swap(str,l,i);
        		permute(str, l+1, r);
        		str = swap(str,l,i);
    		}
    	}
	}

	// function to swap charactor in string

	public static String swap(String a, int i, int j)
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
	
	//TRIPLATE
	

	// to find triplet of sum is equal to zero

	public  int find(int a[])
	{	
		int count=0;
		for (int i=0 ; i<a.length ; i++ )
		{	
			for (int j=i+1 ; j<a.length ; j++ )
			{
				for (int k=j+1 ; k<a.length ; k++ )
				{
					if(a[i]+a[k]+a[j]==0)
					{
						System.out.println("("+a[i]+" "+a[j]+" "+a[k]+")");
						count++;
					}
				}
			}
		}
		return count;
	}
	
	//LEAPYEAR
	
	public static boolean checkLeapYear(int year) 
	{
		if(year%4 == 0 || year%400 == 0 || year%100 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}	
