/**
Q1) Handle exceptions in the number Problem statement: 
Get the input String from the user and parse it to an integer, if it is not a number it will throw NumberFormatException, Catch this exception and print "Entered input is not a valid format for an integer." or else print the square of that number. (Refer to Sample Input and Output). 

Sample input and output 
1: Enter an integer: 12 
The square value is 144 
The work has been done successfully 
*/



package com.Day_20_Exception_Handling;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER THE INTEGER");
		try {
			String s1=scanner.next();
			int n=Integer.parseInt(s1);
		
			System.out.println("THE SQUARE VALUE IS:" +(n*n));
		} catch (NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer");
		}
		finally {
			System.out.println("The work has been done successfully ");
		}
		scanner.close();
		

		}

}
