[Back to main Page](./../../README.md)

# Lernjournal 21.09.2022
## Was habe ich diese Woche gemacht?
- **Abstrakte Classen**<br/>
Als erstes haben wir zusammen in der Klasse angeschaut, was Abstrakte Klassen sind und wie sie Funktioneren. Wenn man eine Klasse in Java mit dem `abstract` Keyword anschreibt, kann man von dieser Klasse keine Instanz mehr erstellen. Nun könnte man sich natürlich fragen, warum sollte das einen Vorteil bringen. Die Antwort darauf ist relativ einfach. Die Abstracte Klasse kann immernoch in anderen Klassen implementiert werden. Um auf das Beispiel aus der letzten Woche zu referenzieren könnte man nun die Klasse `Car` abstrakt gestalten. Dadurch beinhaltet die Klasse `Car` zwar immernoch alle notwendigen Attribute und Methoden mitsamit ihrere Logik kann allerdings nichtmehr istanziert werden (Was ohnehin nie beabsichtigt war).
```java 
//ParentClass.java
public abstract class ParentClass{}

//ChildClass.java
public abstract class ChildClass extends ParentClass{}

//Main.java
public class Main{
    public static void main(String ... args){
         ParentClass parentClass = new ParrentClass(); //Does not compile because class in abstract
         ParentClass childClass = new ChildClass(); //Does compile because it is inizalized with child class
    }
}
```
- **Abstrakte Methoden** <br/>
Eine abstrakte Klasse beinhaltet natürlich auch Methoden. Diese können müssen aber nicht abstrakt sein.Wenn eine Methode das `abstract` keyword hat, besitzt diese Methode keinen Body mehr. Das bedeutet so viel wie, dass in der Klasse zwar steht, dass es eine Methode gibt die z.B. `start()` heist, die Implementieren von dieser Methode ist allerdings dann sache von den Childklassen. Ein Beispeil dafür währe z.B. die Methode `.tanken()` am `Car`. Dadurch könnte man beschreiben, dass es eine Methode geben muss, um das Auto aufzutaken die Implementation davon ist allerdings etwas was die ChildKlassen übernehmen müssen z.B. darum, weil man ein Eleketrouto anderst tankt als ein Konventionelles. Natürlich können Abstrakte Methoden nur in Abstrakten Klassen erstellt werden.

```java
public abstract class Car{
    public abstract void tanken();
}

public class ElektroCar extends Car{
    @Override
    public void tanken(){
        System.out.println("Elektroauto wird aufgeladen");
    }
}
```
- **Interfaces**<br/>
Ein Interface ist der Faktor her eine Abstrakte Classe, bei der alle Methoden per default abstract und public sind. Ein interface wird anderst als eine Klasse mit dem `implements` Keyword implementiert. Hingegen zu KLassen können in java bis zu `65535` interfaces in einer Klasse implementier werden. Das liegt daran, dass ein Interface keine Logik beinhaltet -> egal ob 2 verschiedene Interfaces die selbe Methode implementieren muss der Javacompiler nicht zwischen 2 verscheidenen Codeblöcken entscheiden, da das implementieren von Logik nur in einer Klasse statfinden kann. 

```java
public interface MyInterface {
    public void myMethod();
}
public class MyClass implements MyInterface {
    public void myMethod() {
        System.out.println("Hello World!");
    }
}
```
## Was habe ich gelernt?

## Reflexion
