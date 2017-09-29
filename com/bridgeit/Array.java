import java.util.*;
import java.io.*;
class Array
{
	public static void main(String args[])
<<<<<<< HEAD
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
		// reading array element and storing in array
=======
	{
		int row = Integer.parseInt(args[0]);
		int col = Integer.parseInt(args[1]);
		Scanner s = new Scanner(System.in);
		PrintWriter p = new PrintWriter(System.out);
		int arr[][] = new int[row][col];
		p.println("Enter array Elements:");
		p.flush();
>>>>>>> ca94437120a68ee8dfa56c6bb3071a8ab979a738
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		p.println("Array element are:");
		p.flush();
<<<<<<< HEAD
		//printing array element
=======
>>>>>>> ca94437120a68ee8dfa56c6bb3071a8ab979a738
		for(int i=0;i<row;i++)
                {
                        for(int j=0;j<col;j++)
                        {
                                p.print(arr[i][j]+" ");
                        }
			p.println();
                }
		p.close();
		System.out.println();

	}
}
