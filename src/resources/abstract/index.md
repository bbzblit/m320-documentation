[Back to main Page](./../../../README.md)

# Abstract
Bei Resources handelt es sich um einen Folder. Aus diesem Gründen ist er nicht von GithubPages aus erreichbar. Um das ganze Projekt zu sehen muss es auf Github geöffnet werden.


## Umsetzung
Ich habe das bestehende Game so angepasst, dass neu die Klasse `Car` abstract ist. Ausserdem ist die Methode `getPrice()` abstract, da sich der Preis bei einem CrashedCar anderst berechnet als bei einem UsedCar. 

```java
public abstract class Car {
    private String model;
    protected double price;

    public Car(String model, double price){
        this.model = model;
        this.price = price;
    }
    public abstract double getPrice();
}
```