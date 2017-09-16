class LeapYear
{
	public static void main(String args[])
	{
		try
		{
			int year = Integer.parseInt(args[0]);
			if(year >999)
			{
				if(year%4 == 0)
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
