[Back to main Page](./../../README.md)

# Lernjournal 14.09.2022
## Was habe ich diese Woche gemacht?
- **Vererbung** <br/>
Am Anfang der Stunde haben wir UML Diagramme für 3 Fahrzeugtypen (Auto, Elektroauto und LKW) erstellt. Dabei ist schnell aufgefallen, das obwohl es sich dabei um unterschidliche Fortbewegungsmittel handelt gewisse Grundstruktur bei allen dreien vorhanden ist. Ein Beispiel dafür währe die Methode `.losfahren()`, die logischerweise bei allen 3 Fahrzeugen vorhanden sein muss. Nun währe es natürlich cool, wenn es eine Möglichkeit gäbe, dass man die Logik hinter der Methode nur einmal erstellen müsste, und sie dann in allen anderen Klassen verwenden könnte. Die Lösung dafür in Java ist Vererbung. Mithilfe von Vererbung können alle Methoden und Attribute und deren Logik einer anderen Klasse übergeben werden. Um eine Klasse in Java zu vererben kann man das Keyword `extends` verwenden.

```java
/**
ChildClass erbt von ParrentClass
*/
public class ChildClass extends ParrentClass{

}
```
In `Java` kann im gegensatz zu anderen Programiersprachen wie z.B. `C++` oder auch `Python` immer nur eine Klasse extenden. Das liegt unteranderm daran, dass das extenden von mehreren Klassen sehr fehleranfällig sein kann. Wenn z.B. 2 Klassen das selbe Methode `.start()` haben ist immer die Frage, welche von beiden Implementierten Methoden nun aufgerufen wird. Etwas anderst sieht es da bei dem Implementieren von Interfaces aus. Diese können in Java belibig häufig Implementiert werden. Interfaces beinhalten im gegensatz zu Klassen allerdings auch nur die Struktur und keine Logik. Ein Beispiel von mehreren Interfaces stellt die `java.lang.String` Klasse dar. 

```java
public final class String
    implements java.io.Serializable, Comparable<String>, CharSequence,
               Constable, ConstantDesc {
}
```
- **Implementieren von Vererbungen** <br/>
ALs nächstes haben wir in Pairprogramming Vererbung anhand eines Beispieles Implementiert. In dem Beispiel gibt es 3 Klassen die Klasse `Car` dient als Parrent Klasse für die beiden Childklassen `UsedCar` und `CrashedCar`. Bei der Übung kam auch als erstes einmal das `super` Keyword vor. Dieses ist relativ ähndlich zu dem `this` Keyword. Der Unterschied bezieht sich lediglich darauf, dass das `this` auf Eelemente und Methode aus der Aktuellen Klasse zugreifen kann wobei `super` benutzt werden kann um Methoden in der Parentklasse aufzurufen. 

- **Statische/Dynamische Polymorphie** <br/>


**Statische Polymorphie** <br/>
Statische Polymorphie hat erstmal nichts mit statischen Methoden oder Attributen zu tun. Bei Statischer Polymorphie werden Methoden oder auch Construktoren über laden. D.H dass es mehrere Ausführungen von einenm Konstruktor gibt, der sich nur anhand der Parameter unterscheidet. 

```java
public class Car{
    public Car(){}             // Die Konstruktoren unterscheiden sich nur
    public Car(String name){}  // anhand der Parameter
}
```
**Dynamische Polymorphie** <br/>
Bei Dynamischer Polymorphie werden die Konstruktoren ncht um Parameter erweiteter sondern überschrieben. Dynamische Polymorphie kommt z.B. dann zu Ensatz, wenn sich etwas in der Logik in der Childklasse ändernt. 
```java
public class Parent{
    public void doSomething(){}
}

public class Child extends Parent{
    
    @Overide
    public void doSomething(){
        System.out.println("Now I'm doing something");
    }
}

```

## Was habe ich gelernt?
In dieser Woche konnte ich nochmals gut das Thema Vererbung repetieren. Dabei habe ich neu hinzugelernt, was der Unterschied zwischen Statischer und Dynamischer  Polymorphie ist. Auserdem war mir zwar vorher schon bewusst, dass man in Java nur eine Klasse extenden kann. ALlerdings waren mir die Hntergründe dafür nicht bekannt. Vermutlich auch daher, dass ich auch in Python noch **nie** nur auf die Idee gekommen währe 2 Klassen zu extenden. 

## Reflexion
Ich denke, dass ich diese Woche gut vorangekommen bin. Ich konnt gut das Thema Verbung repetieren und konnte dazu auch noch neues dazulernen. 
