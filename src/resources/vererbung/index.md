[Back to main Page](./../../../README.md)

# Vererbung
Bei Resources handelt es sich um einen Folder. Aus diesem Gründen ist er nicht von GithubPages aus erreichbar. Um das ganze Projekt zu sehen muss es auf Github geöffnet werden.

# YT Video
https://youtu.be/_yT-_Tm0XMg


## Wichtige Klassen
```java
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
```
```java
public class CrashedCar extends Car{
    private int damagelevel;
    public CrashedCar(String model, double price, int damagelevel) {
        super(model, price);
        this.damagelevel = damagelevel;
    }

    public double getPrice() {
        return super.getPrice();
    }
     public int getDamagelevel() {
         return damagelevel;
    }
    public void  setDamagelevel(int damagelevel) {
        this.damagelevel = damagelevel;
    }
}
```
```java
public class UsedCar extends Car{
    private int mileage;
public UsedCar(String model, double price, int mileage) {
    super(model, price);
    this.mileage = mileage;
}

    public double getPrice() {
        return super.getPrice();
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}

```