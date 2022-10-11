package dev.bbzblit.m320;

public class CrashedCar extends Car {

	private DAMAGE_LVL damageLevel;
	
	public CrashedCar(final String model,final double price, final DAMAGE_LVL damageLevel) {
		super(model, price);
		this.damageLevel = damageLevel;
	}

	public DAMAGE_LVL getDamageLevel() {
		return damageLevel;
	}

	public void setDamageLevel(final DAMAGE_LVL damageLevel) {
		this.damageLevel = damageLevel;
	}
	
	public double getPrice() {
		double price = super.getPrice();
		switch (this.damageLevel) {
		case LOW:
			return price * 0.9;
		case MEDIUM:
			return price * 0.5;
		default:
			return 0;
		}
		
	}

	private enum DAMAGE_LVL{
		LOW, MEDIUM, HEIGH
	}
	

}
