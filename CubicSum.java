import java.util.*;
class CubicSum
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0 ; i<a.length; i++)
		{
			a[i] = s.nextInt();
		}
		int count = find(a);
		System.out.println("Number of distinct triplets : "+count);
		
	}
<<<<<<< HEAD
	// to find triplet of sum is equal to zero
=======
>>>>>>> ca94437120a68ee8dfa56c6bb3071a8ab979a738
	public static int find(int a[])
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
}
