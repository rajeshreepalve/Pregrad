/*
Q3) Create a user-defined checked exception called InsufficientFundsException. 
Create a class called Account with 2 fields: 
accountNumber: String 
balance: double 

and define the following 2 methods inside the Account class: 
deposit(amount): void 
withdraw(amount): double 
withdraw(amount) method throws the InsufficientFundException to the caller with suitable message. when the supplied amount is greater than the balance amount. 

Create an AccountDemo class with the main method and perform the following task: 
Create the Account class object by passing the Account number and minimum balance 500. You can deposit the amount into that account by invoking the deposit() method by passing the deposit amount as an argument. 
If you have a balance in your account, you have to withdraw the amount by invoking the withdraw() method by passing a suitable amount as an argument. But, if your requested amount is more than the available balance, handle the exception and print the proper message. 
Note: make sure the application should be terminated normally. 
*/

package com.Day_20_Exception_Handling;

public class InsufficientFundsException extends Exception {

	/**
	 * 
	 */
	public InsufficientFundsException() {
		// TODO Auto-generated constructor stub
	}
	public InsufficientFundsException(String m) {
		// TODO Auto-generated constructor stub
		super();
	}
	
	

}
