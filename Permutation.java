import java.util.*;
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
        	Permutation permutation = new Permutation();
		// calling permute function to find all permutation 
        	permutation.permute(str, 0, n-1);// passing string,0 and lenght of string
    	}
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
}
