package com.bridgeit.Programs;
import java.util.Scanner;
class Input
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String string = "Hello <<UserName>>, How are you?";
		System.out.println(string);
		System.out.println("Enter the user name");
		String name = s.nextLine();
		string = string.replace("<<UserName>>", name);
		System.out.println(string);
        s.close();
	}
} 
