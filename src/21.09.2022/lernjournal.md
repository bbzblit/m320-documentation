[Back to main Page](./../../README.md)

# Lernjournal 21.09.2022
## Was habe ich diese Woche gemacht?
- **Abstrakte Classen**<br/>
Als Erstes haben wir zusammen in der Klasse angeschaut, was abstrakte Klassen sind und wie sie funktionieren. Wenn man eine Klasse in Java mit dem `abstract` Keyword anschreibt, kann man von dieser Klasse keine Instanz mehr erstellen. Nun könnte man sich natürlich fragen, warum sollte das einen Vorteil bringen. Die Antwort darauf ist relativ einfach. Die abstrakte Klasse kann immer noch in anderen Klassen implementiert werden. Um auf das Beispiel aus der letzten Woche zu referenzieren, könnte man nun die Klasse `Car` abstrakt gestalten. Dadurch beinhaltet die Klasse `Car` zwar immer noch alle notwendigen Attribute und Methoden mitsamt ihrer Logik kann allerdings nicht mehr distanziert werden (Was ohnehin nie beabsichtigt war).

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
Eine abstrakte Klasse beinhaltet natürlich auch Methoden. Diese können müssen aber nicht abstrakt sein. Wenn eine Methode das `abstract` Keyword hat, besitzt diese Methode keinen Body mehr. Das bedeutet so viel wie, dass in der Klasse zwar steht, dass es eine Methode gibt, die z. B. `start()` heisst die Implementieren von dieser Methode ist allerdings dann Sache von den Childklassen. Ein Beispiel dafür währe z. B. die Methode `. tanken()` am `Car`. Dadurch könnte man beschreiben, dass es eine Methode geben muss, um das Auto aufzutanken die Implementation davon ist allerdings etwas, was die ChildKlassen übernehmen müssen z. B. darum, weil man ein Elektroauto anders tankt als ein Konventionelles. Natürlich können abstrakte Methoden nur in abstrakten Klassen erstellt werden.

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
Ein Interface ist der Faktor her eine abstrakte Klasse, bei der alle Methoden per Default Abstract und Public sind. Ein Interface wird anders als eine Klasse mit dem `Implements` Keyword implementiert. Hingegen zu Klassen können in Java bis zu `65535` Interfaces in einer Klasse implementier werden. Das liegt daran, dass ein Interface keine Logik beinhaltet -> egal ob 2 verschiedene Interfaces dieselbe Methode implementieren muss der Javacompiler nicht zwischen 2 verschiedenen Codeblöcken entscheiden, da das implementieren von Logik nur in einer Klasse stattfinden kann.

```java
public interface MyInterface {
    public void myMethod();
}
public class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Hello World!");
    }
}
```
## Was habe ich gelernt?
Ich habe in dieser Woche eine gute Reflexion über Interfaces und abstrakten Klassen gehabt. Dabei habe ich auch ein paar interessante Fakten dazugelernt wie z. B., dass in Java Interfaces defaultmäßig alle Methoden Public sind.
## Reflexion
In dieser Woche bin ich gut vorangekommen. Ich konnte alles im Unterricht, behandelte gut und konnte daher auch die Aufgaben ohne grössere Probleme lösen. In der nächsten Woche muss ich noch an den Handlungskompetenzen weiterarbeiten, da ich diese Woche da nicht sonderlich weit gekommen bin.
