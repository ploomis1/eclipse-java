/**
 * Name: Parker Loomis
 * Assignment: Lab Assignment 1
 * Class: CS 1120
 * Description:
 * Date:
 */

package edu.wmich.cs1120.spring16.Bank;

public class Account {
	private int accountNumber;
	private double accountBalance;

	public Account(int accountNum, double accountBal){
		this.accountBalance=accountBal;
		this.accountNumber=accountNum;
	}
	//The Account class should also have a get method for each of the attributes and methods for each of the two main transactions (deposit, withdraw). There should be no set method for the account number as this should not change.

	// Return account number
	public int getAccountNumber(){
		return this.accountNumber;
	}

	// Return account balance
	public double getAccountBalance(){
	return this.accountBalance;	
	}

	// Deposit specified amount in this account
	public void deposit(double depositAmount){
		this.accountBalance=this.accountBalance+depositAmount;
	}

	// Withdraw specified amount from this account
	public void withdrawl(double withdrawlAmount){
		this.accountBalance=this.accountBalance-withdrawlAmount;	
	}
}
