import java.util.*;
class TicToe
{
	public static void main(String args[])
	{	
		Scanner s = new Scanner(System.in);
		String arr[][] = new String[3][3];
		int player =1;
		boolean finish = false;
		while(finish!=true)
		{	
			System.out.println("Enter the location where you want to move");
			int row = s.nextInt();
			int col = s.nextInt();
			if(player==1)
			{
				arr[row][col]="X";
				player=2;
			}
			else
			{
				arr[row][col]="0";
				player=1;
			}
		}
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]+"|");
			}
			System.out.println();
		}		 
	}
} 
