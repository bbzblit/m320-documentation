public class Car {
    private String model;
    private double price;

    public Car(String model, double price){
        this.model = model;
        this.price = price;
    }
    protected double getPrice() {
        return price;

    }

}
