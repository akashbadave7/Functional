import java.util.*;
import java.math.*;
public class Quadratic
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("a ="); // reading value of a
		int a = scan.nextInt();
		System.out.print("b ="); // reading value of b
		int b = scan.nextInt();  
		System.out.print("c ="); // reading value of c
		int c = scan.nextInt();
		
		int delta = (b*b)-(4*a*c); 
		double x1,x2;
		if(delta>0)
		{
			x1 = (-b + (Math.sqrt(delta)))/(2*a); // calculating root 1
			x2 = (-b - (Math.sqrt(delta)))/(2*a); // calculating root 2
			System.out.println("Roots of X ("+x1+","+x2+")");
		}
		else 
		{
			x1 = (-b + (Math.sqrt(delta)))/(2*a); // calculating root 1
			System.out.println("Roots of X ("+x1+","+x1+")");
		} 
	}
}	
