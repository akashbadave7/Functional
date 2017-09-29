import java.math.*;
public class WindChill 
{
	public static void main (String[] args) 
	{
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		if(t<=50 && v>=3 && v<=120)
<<<<<<< HEAD
		{	
			// to compute wind chill using formula
			double powv = Math.pow(v,0.16);	
=======
		{
			double powv = Math.pow(v,0.16);
>>>>>>> ca94437120a68ee8dfa56c6bb3071a8ab979a738
			double w = 35.74 + 0.6215*t + (0.4275*t - 35.75)*powv;
			System.out.println("T = "+t);
			System.out.println("V = "+v);
			System.out.println("Wind Chill = "+w);
			
		}
		else
		{
			System.out.println("The value of t<=50 and 3<=v<=120 ");
		}
	}    
}
