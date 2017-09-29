package com.bridgeit.Programs;

class Gambler
{
	public static void main(String args[])
	{	// to read value as command line argument
		int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int times = Integer.parseInt(args[2]);
		int bets =0,win=0,loss=0;

		// to calculate win or loss
		
		for (int i=1 ; i<=times ; i++)
		{
			int cash = stake;
			while (cash >0 && cash < goal)
			{
				bets++;
				if(Math.random() < 0.5)
				{
					cash++;
				}
				else
				{	
					cash--;
				}
			}
			if(cash == goal)
			{
				win++;
			}
			else
			{
				loss++;
			}		
		}
		System.out.println("Wins = "+win);
		System.out.println("Loss = "+loss);
		System.out.println("Win percentage = "+(win*100/times)+"%");
        System.out.println("Loss percentage = "+(loss*100/times)+"%");
	}
}
