package com.bridgeit.Programs;
import java.util.Scanner;
class Input
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		String string = "Hello <<UserName>>, How are you?";
		System.out.println(string);
		System.out.println("Enter the user name");
		String name = scanner.nextLine();
		string = string.replace("<<UserName>>", name);
		System.out.println(string);
		scanner.close();
	}
} 
