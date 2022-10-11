package dev.bbzblit.m320;

public class UsedCar extends Car{
	
	private int mileAge;
	
	public UsedCar(final String model,final double price,final int mileAge) {
		super(model, price);
		this.mileAge = mileAge;
	}

	public int getMileAge() {
		return this.mileAge;
	}

	public void setMileAge(final int mileAge) {
		this.mileAge = mileAge;
	}
	
	public double getPrice() {
		double kmPrice = (super.getPrice() / 100) * 0.0005;
		return kmPrice > this.getPrice() ? 0d : this.getPrice() - kmPrice;
	}

}
