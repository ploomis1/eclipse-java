/**
 * Name: Parker Loomis
 * Assignment: Lab Assignment 1
 * Class: CS 1120
 * Description:
 * Date:
 */




package edu.wmich.cs1120.spring16.Bank;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String [] args)throws IOException{
		
		File file = new File("accounts.txt");

		Scanner kbd1 = new Scanner(file);
		int[] accounts = new int[11];
		double[] balances = new double[11];
		int j = 0;
		while (kbd1.hasNext()) {
			int i = kbd1.nextInt();
			double k = kbd1.nextDouble();
			accounts[j] = i;
			balances[j]=k;
		//	System.out.println(i+ " "+
			//		k);
			j++;
		}
		kbd1.close();
		Scanner kbd= new Scanner(System.in);
		//for (int i = 0; i < accounts.length; i++) {
			//System.out.println(balances[i]);
		//}
	        boolean k=true;
			while(k=true){
			printMenu();
			
			int choice=getChoice(kbd);
			int h=0;
			if(choice==1){//deposit
				int account1=getAccountNumber(kbd);
				double amount= getAmount(kbd);
				
				for(int i=0;i<accounts.length;i++){
					if(account1==accounts[i]){
						h=i;
						
					}	
					
				}
				Account account = new Account(accounts[j],balances[j]);
				account.deposit(amount);
				balances[h]=account.getAccountBalance();
				
			}
			if(choice==2){//withdrawl
				int account1=getAccountNumber(kbd);
				double amount= getAmount(kbd);
				for(int i=0;i<accounts.length;i++){
					if(account1==accounts[i]){
						h=i;
						
					}	
					
				}
				Account account = new Account(accounts[h],balances[h]);
				account.withdrawl(amount);
				balances[h]=account.getAccountBalance();
			}
			if(choice==3){//transfer
				int [] tAccounts = new int[2];
				tAccounts=getTransferAccountNumbers(kbd);
				double amount= getAmount(kbd);
				int f=0;
				for(int i=0;i<accounts.length;i++){
					if(tAccounts[0]==accounts[i]){
						h=i;
						
					}	
					
				}
				
				Account account = new Account(accounts[h],balances[h]);
				double balance = account.getAccountBalance();
				account.withdrawl(amount);
				balances[h]=account.getAccountBalance();
				
				for(int i=0;i<accounts.length;i++){
					if(tAccounts[1]==accounts[i]){
						
						h=i;
											}	
					
				}
				
				
				Account account3 = new Account(accounts[h],balances[h]);
				account3.deposit(amount);
				balances[h]=account3.getAccountBalance();
				
			}
			if(choice==0){
				k=false;
				break;
			}
			
			}
		
			
			FileOutputStream fos = new FileOutputStream(file);
		 
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		 
			for (int i = 0; i < 10; i++) {
				bw.write(accounts[i]+" "+balances[i]);
				bw.newLine();
			}
		 
			bw.close();

		
	}
	// Print menu showing available options (1, 2, 3, 0) to the screen
	public static void printMenu(){
		Scanner kbd = new Scanner(System.in);
		//Account a =new Account();
		
		System.out.println("1.Deposit\n"
				+ "2.Withdrawl\n"
				+ "3.Transfer\n"
				+ "0.Exit");
		
		
	}

	// Read in the user’s desired option / choice
	public static int getChoice(Scanner keyboard){
		int choice=keyboard.nextInt();
		return choice;
		
	}

	// Get relevant account number from user for a deposit or withdraw transaction
	public static int getAccountNumber(Scanner keyboard){

		System.out.println("Please input the account number");
		int account=keyboard.nextInt();
		
		return account;
		
	}

	// Get relevant account numbers from user for a transfer transaction
	public static int[] getTransferAccountNumbers(Scanner keyboard){
		int []transfer = new int[2];
		System.out.println("Please input the account number to transfer from");
		transfer[0]=keyboard.nextInt();
		
		System.out.println("Please input the account number to transfer to");
		transfer [1]=keyboard.nextInt();
		
		
	return transfer;
	}

	// Get amount from user for the current transaction
	public static double getAmount(Scanner keyboard){

		System.out.println("Please enter the amount");
		double amount=keyboard.nextDouble();
		return amount;
	}
		
	
	// Update input file with the new account balances based on user’s transactions
	public static void updateAccountDatabase(Account[] account) throws IOException{
		
	}

}
