import java.util.*;
class StopWatch
{
	public static void main(String args[])
	{
		double start,end,elapsed;
		start = System.currentTimeMillis();//to start timer
		System.out.print("Hello, ");
		System.out.println("are you?");
		end = System.currentTimeMillis();//to end timer
		elapsed = end - start;
		System.out.println("Elapsed time is "+elapsed+"ms");//to find elapsed time
	}
}
