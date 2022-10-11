[Back to main Page](./../../../README.md)

# Fachklassen
Bei Resources handelt es sich um einen Folder. Aus diesem Gründen ist er nicht von GithubPages aus erreichbar. Um das ganze Projekt zu sehen muss es auf Github geöffnet werden.

## Wichtigste Klassen
### Main
```java
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
```

### Konto
```java
package dev.bbzblit.learning;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Konto {
	
	private List<String> logs;
	private double kontostand;
	
	public Konto() {
		this.logs = new ArrayList<String>();
	}
	
	public double getAmount() {
		return this.kontostand;
	}
	
	public void addAmount(double amount) {
		this.kontostand = this.kontostand + amount;
		this.logs.add(String.format("[Time: %s] Added %s to konto. New balanace %s", 
			LocalDateTime.now(), amount, this.kontostand ));
	}
	
	public void removeAmount(double amount) {
		this.kontostand = this.kontostand - amount;
		this.logs.add(String.format("[Time: %s] Removed %s from konto. New balanace %s",
			LocalDateTime.now(), amount, this.kontostand ));
	}
	
	public void updateAmout(double amount, String operator) {
		if(operator.equals("+"))
			addAmount(amount);
		else if(operator.equals("-"))
			removeAmount(amount);
		else
			throw new IllegalArgumentException("Operator" + operator + 
				"is not a valid operatior (+, -)");
	}
	public List<String> getLogs(){
		return this.logs;
	}
}
```
