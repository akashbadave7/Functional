package com.bridgeit.Programs;
import java.util.Scanner;
import com.bridgeit.utility.*;
public class IterativePermutation 
{
    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String string = scanner.nextLine();
        Utility.permute(string);
        scanner.close();
    }
    
}