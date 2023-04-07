/**
●	Write a class Main, in which define a static method called getEligibility.
●	the return type of this method should be void and it takes one parameter as int age.
●	If the supplied age is less than 18 then throw an ArithmeticException class object with the
●	message “Invalid age”.
●	If the age is greater than 18 then print the message “You are Eligible”.
●	from the main method of Main class, prompt the user to Enter the age using Scanner class.
●	call the getEligibility method inside the try-catch block from the main method by passing
●	user-entered age

*/




package com.Day_19_NestedBlock;

import java.io.IOException;
import java.util.Scanner;


public class Folks {
	



	public static void getEligibility(int Age)  {
		if(Age<18) {
			throw new ArithmeticException("you are not eligible for Police recruiment in Maharastra");
		}
		else {
			System.out.println("WELCOME TO MAHARASTRA POLICE RECRUIMENT 2023");
		}
	}
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER THE AGE OF APPLICANT");
		
		try {
			int age=scanner.nextInt();
			getEligibility(age);
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

		}
		
			
		
		
		
	
		
} 

		
		
 		



	
