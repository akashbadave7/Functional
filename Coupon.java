import java.math.*;
class Coupon
{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		int arr[] = new int[n];
		random(n,arr);
		System.out.println("---------------------------------------------------------------");
		distinct(arr);
	}
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
}
