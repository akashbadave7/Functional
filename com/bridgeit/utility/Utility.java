package com.bridgeit.utility;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Utility 
{
	/**
	 * @param row
	 * @param column
	 * @param choice
	 * @author akash
	 * reads 2D array
	 */
	public static void input(int row, int column, int choice) 
	{
		Scanner scanner = new Scanner(System.in);
		switch(choice)
		{
		case 1 : Integer integerArray[][] = new Integer[row][column];
					System.out.println("Enter array Elements:");
					for (int i=0;i<integerArray.length;i++)
					{
						for(int j=0;j<integerArray[i].length;j++)
						{
							integerArray[i][j] = scanner.nextInt();
						}
					}
					System.out.println("Array element are:");
					printArrayElement(integerArray);
				
			break;
		case 2 : String stringArray[][] = new String[row][column];
					System.out.println("Enter array Elements:");
					for (int i=0;i<stringArray.length;i++)
					{
						for(int j=0;j<stringArray[i].length;j++)
						{
							stringArray[i][j] = scanner.next();
						}
					}
					System.out.println("Array element are:");
					printArrayElement(stringArray);
				
			break;
		case 3 : Double doubleArray[][] = new Double[row][column];
					System.out.println("Enter array Elements:");
					for (int i=0;i<doubleArray.length;i++)
					{
						for(int j=0;j<doubleArray[i].length;j++)
						{
							doubleArray[i][j] = scanner.nextDouble();
						}
					}
					System.out.println("Array element are:");
					printArrayElement(doubleArray);
			break;
		
		}
	}
	
	/**
	 * @param arr
	 * @author akash
	 * Prints 2D array
	 */
	public static <T> void printArrayElement(T[][] arr) 
	{
		for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
            	System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
		
	}
	
	//COUPON PROGRAM
	
	/**
	 * @param n
	 * @param arr
	 * @author akash
	 *  to generate random coupon number
	 */
	public static void random(int n,int array[])
	{
		for (int i = 0; i < n; i++) 
		{
			array[i] = (int)(Math.random()*9999);

		    for (int j = 0; j < i; j++) 
		    {
		        if (array[i] == array[j]) {
		            i--; 
		            break;
		        }
		    }  
		}
	}



	/**
	 * @param arr
	 * @author akash
	 * to eliminate duplicate coupon number and print unique coupon number
	 */
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
	
	
	/**
	 * @param str
	 * @param l
	 * @param r
	 * @author akash
	 * PARMUTATION of given number or string
	 */
	public static  <T> void permute(T str, int l, int r)
	{	//if string lenth is 1
    	if (l == r)
        		System.out.println(str);
    	else
    	{	
    		for (int i = l; i <= r; i++)
    		{
        		str = (T) swap(str,l,i);
        		permute(str, l+1, r);
        		str = (T) swap(str,l,i);
    		}
    	}
	}

	// function to swap charactor in string

	/**
	 * @param a
	 * @param i
	 * @param j
	 * @author akash
	 * function to swap charactor in string
	 * @return character array
	 */
	public static <T> String swap(T a, int i, int j)
	{
		char temp;
		char[] charArray = ((String) a).toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
	
	//TRIPLATE

	/**
	 * @param <T>
	 * @param a
	 * to find triplet of sum is equal to zero
	 * @author akash 
	 * @return count of triplate
	 */
	public int find(int a[])
	{	
		int count=0;
		int array[]= {0,0,0};
		Arrays.sort(a);
		for (int i=0 ; i<a.length ; i++ )
		{	
			for (int j=i+1 ; j<a.length ; j++ )
			{
				for (int k=j+1 ; k<a.length ; k++ )
				{
					
					if(a[i]+ a[k]+a[j]==0)
					{
						if(a[i]!=array[0] || a[j]!= array[1] )
						{
							System.out.println("("+a[i]+" "+a[j]+" "+a[k]+")");
							count++;
							array[0]=a[i];
							array[1] =a[j];
						}
					}
				
				}
			}
		}
		return count;
	}
	
	//LEAPYEAR
	
	/**
	 * @param year
	 * @author akash
	 * @return true if year is leap or false
	 * find year is leap year or not
	 */
	public static boolean checkLeapYear(int year) 
	{
		if(year%400 == 0 || year%4 == 0 && year%100 !=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//IterativePermutation
	/**
	 * @param str
	 * @author akash
	 * Permutation using Iterative method
	 */
	public static void permute(String str)
    {
        char[] temp = str.toCharArray();
        // Step 1. Sort the string
        Arrays.sort(temp);
        System.out.println(String.valueOf(temp));
        int index = 0;
        int lowest = 0;
        while(true){
            // Step 2. Rightmost char smallest than its neighbour
            for(int i = 0; i < temp.length - 1; i++)
            {
                if(temp[i] < temp[i+1])
                {
                    lowest = i;
                }
            }
            // index of CHAR1
            index = lowest;
            // Step3. Find the ceiling of the 
            int j = findCeiling(temp, index);
            // Breaking condition at this juncture
            // all permutations are printed
            if(j == index) break;
            
            swap(temp, index, j);
            String a = String.valueOf(temp);
            // Step4. Sort the substring
            char[] b = a.substring(index + 1).toCharArray();
            Arrays.sort(b);
            a = a.substring(0, index + 1) + String.valueOf(b);
            temp = a.toCharArray();
            System.out.println( String.valueOf(temp));
        }  
    }
    
    /**
     * 
     * @param temp
     * @param index
     * @author akash
     * @return index of array
     */
    public static int findCeiling(char[] temp, int index)
    {
        int k = index;
        char test = temp[index];
        while (k < temp.length - 1)
        {
            if(temp[index] < temp[k + 1])
            {
                index = k + 1;
                break;
            }
            k++;
        }
        k = index;
        while (k < temp.length - 1)
        {
            if((temp[index] > temp[k + 1]) && (temp[k + 1] > test))
            {
                index = k + 1;
            }
            k++;
        }
        return index;
    }
    
    /**
     * Method used for swapping the char
     * @param str
     * @param i
     * @param j
     * @author akash
     */
    private static void swap(char[] str, int i, int j)
    {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
	
	
}	
