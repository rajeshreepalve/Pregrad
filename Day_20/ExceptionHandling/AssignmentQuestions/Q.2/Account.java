


package com.Day_20_Exception_Handling;

public class Account {
	
	String accountNumber;
	double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}


	public void deposit(double amount) {

		System.out.println("Amount is successfully deposited" );
		System.out.println("New balance is "+ (balance+amount));


	}
	public double withdraw(double amount) throws InsufficientFundsException{


		if(balance >= amount) {
			balance = balance-amount;
			return balance;
		}else 
			
		{
			throw new InsufficientFundsException("insuffficient balance");



		}


	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
	
	
	
	

}
