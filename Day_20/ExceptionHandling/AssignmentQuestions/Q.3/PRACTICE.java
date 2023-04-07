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
