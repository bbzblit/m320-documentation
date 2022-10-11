[Back to main Page](./../../../README.md)

# Konstruktoren
Bei Resources handelt es sich um einen Folder. Aus diesem Gründen ist er nicht von GithubPages aus erreichbar. Um das ganze Projekt zu sehen muss es auf Github geöffnet werden.

## Wichtigste Klassen
### Konto
Die Klasse Konto hat neu 2 Konstruktoren.
```java
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Konto {
	
	private List<String> logs;
	private double kontostand;
	
	public Konto() {
		this.logs = new ArrayList<String>();
	}
    public Konto(double initalAmount) {
        this();
        this.kontostand = initalAmount;
    }
	
	public double getAmount() {
		return this.kontostand;
	}
	
	public void addAmount(double amount) {
		this.kontostand = this.kontostand + amount;
		this.logs.add(String.format("[Time: %s] Added %s to konto. New balanace %s", LocalDateTime.now(), 
				amount, this.kontostand ));
	}
	
	public void removeAmount(double amount) {
		this.kontostand = this.kontostand - amount;
		this.logs.add(String.format("[Time: %s] Removed %s from konto. New balanace %s", LocalDateTime.now(), 
				amount, this.kontostand ));
	}
	
	public void updateAmout(double amount, String operator) {
		if(operator.equals("+"))
			addAmount(amount);
		else if(operator.equals("-"))
			removeAmount(amount);
		else
			throw new IllegalArgumentException("Operator" + operator + "is not a valid operatior (+, -)");
	}
	public List<String> getLogs(){
		return this.logs;
	}
}
 Konto {
    
}

```
