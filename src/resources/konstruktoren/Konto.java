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
