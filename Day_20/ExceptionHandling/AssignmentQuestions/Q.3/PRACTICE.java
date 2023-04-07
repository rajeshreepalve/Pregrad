/**
Q4) Write a program that accepts 2 integers a and b as input and finds the quotient of a/b. This program may generate an Arithmetic Exception. Use exception handling mechanisms to handle this exception. In the catch block, print the message as shown in the sample output. also, illustrate the use of the finally block. Print the message “Inside finally block” 
Sample Input and Output 1: 
Enter the 2 numbers 5 2 
The quotient of 5/2 = 2 
Inside finally block 

Sample Input and Output 2: 
Enter the 2 numbers 5 0 DivideByZeroException caught 
Inside finally block 
*/







package com.Day_20_Exception_Handling;

import java.util.Scanner;

public class PRACTICE {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("ENTER THE TWO NUMBERS: ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();

	        try {
	            int quotient = a / b;
	            System.out.println("The quotient of " + a + "/" + b + " = " + quotient);
	        } catch (ArithmeticException e) {
	            System.out.println("DivideByZeroException caught");
	        } finally {
	            System.out.println("Inside finally block");
	        }

	    }

}
