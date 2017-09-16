public class Factors 
{
	public static void main(String[] args) 
	{ 
		// command-line argument
        	long n = Long.parseLong(args[0]);
        	System.out.print("The prime factors are : ");
        	// for each potential factor
        	for (long i = 2; i*i <= n; i++) 
		{
        		// repeatately divide the number
        		while (n % i == 0) 
			{
                		System.out.print(i + " "); 
                		n = n / i;
            		}
        	}
		System.out.println();
	}
}
