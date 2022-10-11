public class UsedCar extends Car{
    private int mileage;
public UsedCar(String model, double price, int mileage) {
    super(model, price);
    this.mileage = mileage;
}

    public double getPrice() {
        return price;

    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
