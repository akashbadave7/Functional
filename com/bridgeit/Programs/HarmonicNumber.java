package com.bridgeit.Programs;

class HarmonicNumber 
{
	public static void main (String[] args) 
	{
		int n = Integer.parseInt(args[0]);
		double har_num = 0.0;

		// to find harmonic value of range n
		for (int i=1;i<=n;i++)
		{
			har_num += 1.0/i;
		}
		/*for(int i=1;i<=n;i++)
		{
			System.out.print("1/"+i+"+");
		}*/
		System.out.println(har_num);
	}
}
