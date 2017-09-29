package com.bridgeit.Programs;

import java.math.*;
class FlipCoin
{
	public static void main(String[] args)
	{
		int head=0,tail=0;
		int n = Integer.parseInt(args[0]);
		//loop n times
		for (int i=1 ;i<=n ;i++)
		{
			double res = Math.random()*1;
			if(res<0.5)
				tail++;
			else
				head++;	
		}
		int headper = (head*100)/n; // calculate head percentage
		int tailper = (tail*100)/n; // calculate tail percentage
		System.out.println("Head : "+head+" Times");
		System.out.println("Tail : "+tail+" Times");
		System.out.println("Head Percentage : "+headper+"%");
		System.out.println("Tail percentage : "+tailper+"%");
	}
}
