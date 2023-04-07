package com.Day_20_Exception_Handling;

import java.util.Scanner;

public class AccountDemo {
	public static void main(String[] args) {
		Account acc = new Account("1234567", 500.00);

		//		acc.deposit(1000.00);

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("WHICH ACTIVITY DO YOU PERFORMED");

		System.out.println("To Deposit Enter 1");
		System.out.println("To Widthdraw Enter 2");

		int num = sc.nextInt();

		if(num==1) {
			System.out.println("Enter amount you want to deposit");
			double amount = sc.nextDouble();
			acc.deposit(amount);

		}
		else if(num==2) {

			System.out.println("Enter amount you want to widthdraw");
			double amount = sc.nextDouble();

			try {
				System.out.println(acc.withdraw(amount));
			} catch (InsufficientFundsException e) {
				
				System.out.println(e.getMessage());
			}

		}else {
			System.out.println("Please enter valid option");
		}
        sc.close();
		
	
     



 
	}
	
	

}
