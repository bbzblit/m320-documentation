package dev.bbzblit.learning;

import java.util.Scanner;

public class Main {

	public static void main(String... args) {
		
		Konto konto = new Konto();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the account application");

		double amount;
		do {
			System.out.println("Pleas enter a amount, 0 to terminate");
			amount = scanner.nextDouble();
			if (amount != 0) {
				System.out.println("To deposit, press +, to withdrwa, press - ");
				konto.updateAmout(amount, scanner.next()); 
			}
		} while(amount != 0);

		scanner.close();
		System.out.println("Your balance " + konto.getAmount());
		System.out.println("---------");
		System.out.println("Your Transactions: ");
		
		for (String transaction : konto.getLogs()) {
			System.out.println(transaction);
		}

	}

}
