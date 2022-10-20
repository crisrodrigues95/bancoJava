package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;





public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter account number: ");
		int anumber = sc.nextInt();
		System.out.println("Enter account holder: ");
		String name = sc.next();
		
		Account account;
		
		
		
		
		System.out.println("Is there an initial deposit (y/n)?: ");
		char yn = sc.next().charAt(0);
		
		if (yn == 'y') {
			System.out.println("Enter initial deposit: ");
			double amount = sc.nextDouble();
			account = new Account(name, anumber, amount);	
		}
		else {
			account = new Account(name, anumber);	
		}
		
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println("Enter a deposit vallue: ");
		double amount = sc.nextDouble();
		account.addAmount(amount);
		System.out.println("Updated value vallue: ");
		System.out.println(account);
		System.out.println("Enter a withdraw vallue: ");
		amount = sc.nextDouble();
		account.reduceAmount(amount);
		System.out.println("Updated value vallue: ");
		System.out.println(account);
		
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
