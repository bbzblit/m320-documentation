[Back to main Page](./../../README.md)

# Lernjournal 14.09.2022
## Was habe ich diese Woche gemacht?
- **Vererbung** <br/>
Am Anfang der Stunde haben wir UML Diagramme für 3 Fahrzeugtypen (Auto, Elektroauto und LKW) erstellt. Dabei ist schnell aufgefallen, dass obwohl es sich dabei um unterschiedliche Fortbewegungsmittel handelt, gewisse Grundstrukturen bei allen Dreien vorhanden sind. Ein Beispiel dafür wäre die Methode `.losfahren()`, die logischerweise bei allen 3 Fahrzeugen vorhanden sein muss. Nun wäre es natürlich cool, wenn es eine Möglichkeit gäbe, dass man die Logik hinter der Methode nur einmal erstellen müsste, und sie dann in allen anderen Klassen verwenden könnte. Die Lösung dafür in Java ist Vererbung. Mithilfe von Vererbung können alle Methoden und Attribute und deren Logik einer anderen Klasse übergeben werden. Um eine Klasse in Java zu vererben, kann man das Keyword `extends` verwenden.

```java
/**
ChildClass erbt von ParrentClass
*/
public class ChildClass extends ParrentClass{

}
```
In `Java` kann im gegensatz zu anderen Programmiersprachen wie z.B. `C++` oder auch `Python` immer nur eine Klasse extendet werden. Das liegt unter anderem daran, dass das Extenden von mehreren Klassen sehr fehleranfällig sein kann. Wenn z.B. 2 Klassen dieselbe Methode `.start()` haben, ist immer die Frage, welche von beiden implementierten Methoden nun aufgerufen wird. Etwas anders sieht es dabei bei der Implementation von Interfaces aus. Diese können in Java beliebig häufig implementiert werden. Interfaces beinhalten im Gegensatz zu Klassen allerdings auch nur die Struktur und keine Logik. Ein Beispiel von mehreren Interfaces stellt die `java.lang.String` Klasse dar. 

```java
public final class String
    implements java.io.Serializable, Comparable<String>, CharSequence,
               Constable, ConstantDesc {
}
```
- **Implementieren von Vererbungen** <br/>
ALs nächstes haben wir in Pairprogramming Vererbung anhand eines Beispieles implementiert. In dem Beispiel gibt es 3 Klassen. Die Klasse `Car` dient als Parent Klasse für die beiden Childklassen `UsedCar` und `CrashedCar`. Bei der Übung kam auch als erstes einmal das `super` Keyword vor. Dieses ist relativ ähnlich zu dem `this` Keyword. Der Unterschied bezieht sich lediglich darauf, dass das `this` auf Eelemente und Methode aus der aktuellen Klasse zugreifen kann, wobei `super` benutzt werden kann, um Methoden in der Parentklasse aufzurufen. 

- **Statische/Dynamische Polymorphie** <br/>


**Statische Polymorphie** <br/>
Statische Polymorphie hat eigentlich nichts mit statischen Methoden oder Attributen zu tun. Bei statischer Polymorphie werden Methoden oder auch Construktoren überladen. D.h., dass es mehrere Ausführungen von einem Konstruktor gibt, der sich nur anhand der Parameter unterscheidet. 

```java
public class Car{
    public Car(){}             // Die Konstruktoren unterscheiden sich nur
    public Car(String name){}  // anhand der Parameter
}
```
**Dynamische Polymorphie** <br/>
Bei dynamischer Polymorphie werden die Konstruktoren nicht um Parameter erweitetert, sondern überschrieben. Dynamische Polymorphie kommt z.B. dann zum Einsatz, wenn sich etwas in der Logik der Childklasse ändert. 
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
In dieser Woche konnte ich nochmals gut das Thema Vererbung repetieren. Dabei habe ich neu hinzugelernt, was der Unterschied zwischen statischer und dynamischer  Polymorphie ist. Auserdem war mir zwar vorher schon bewusst, dass man in Java nur eine Klasse extenden kann. Allerdings waren mir die Hintergründe dafür nicht bekannt. Vermutlich ist dies auch der Fall, weil ich auch in Python noch **nie** nur auf die Idee gekommen wäre 2 Klassen zu extenden. 

## Reflexion
Ich denke, dass ich diese Woche gut vorangekommen bin. Ich konnte gut das Thema Vererbung repetieren und konnte dazu auch noch Neues dazulernen. 
