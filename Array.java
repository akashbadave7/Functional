import java.util.*;
import java.io.*;
class Array
{
	public static void main(String args[])
	{
		int row = Integer.parseInt(args[0]);
		int col = Integer.parseInt(args[1]);
		Scanner s = new Scanner(System.in);
		PrintWriter p = new PrintWriter(System.out);
		int arr[][] = new int[row][col];
		p.println("Enter array Elements:");
		p.flush();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		p.println("Array element are:");
		p.flush();
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
