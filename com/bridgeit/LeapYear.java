class LeapYear
{
	public static void main(String args[])
	{
		try
		{
			int year = Integer.parseInt(args[0]);
<<<<<<< HEAD
			// checking weather year is 4 digit
			if(year >999)
			{	// to find weather it is leap year
				if(year%4 == 0 || year%400 == 0 || year%100 == 0)
=======
			if(year >999)
			{
				if(year%4 == 0)
>>>>>>> ca94437120a68ee8dfa56c6bb3071a8ab979a738
				{
					System.out.println("It is leap year.");
				}
				else
				{
					System.out.println("It is not leap year.");
				}
			}
			else
				System.out.println("Enter the year in four digit");
		}
		catch(Exception e)
		{
			System.out.println("Enter command line argument.");
		}
		
	}
}
