class Gambler
{
	public static void main(String args[])
<<<<<<< HEAD
	{	// to read value as command line argument
=======
	{
>>>>>>> ca94437120a68ee8dfa56c6bb3071a8ab979a738
		int stake = Integer.parseInt(args[0]);
                int goal = Integer.parseInt(args[1]);
                int times = Integer.parseInt(args[2]);
		int bets =0,win=0,loss=0;
<<<<<<< HEAD
		// to calculate win or loss
=======
>>>>>>> ca94437120a68ee8dfa56c6bb3071a8ab979a738
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
