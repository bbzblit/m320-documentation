public abstract class Car {
    private String model;
    protected double price;

    public Car(String model, double price){
        this.model = model;
        this.price = price;
    }
    public abstract double getPrice();
}
