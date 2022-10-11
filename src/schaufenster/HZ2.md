[Back to main Page](./../../README.md)

# Schaufenster HZ2

## B1G

UML (Unified Modeling Language) kann dazu verwendet werden, um die Strukturen von Klassen und deren Beziehungen untereinander in ein Diagramm zu fassen. Dabei wird in einem UML Diagramm die komplete Struktur eines Programmes abgebildet, nicht aber seine Logik.

### Aufbau eines Klassendiagramms
Ein Klassendiagramm besteht aus mehreren Klassen mit Beziehungen untereinander. Jede einzelne Karte bildet eine einzelne Klasse dar. Dabei zeigt es an, welche Methoden, Attrbute und Konstruktoren die Klasse besitzt. Der Aufbau sollte relativ selbsterklärend anhand des unteren Beispieles sein. Acces Modefier können entweder `+` für `public` oder `-` für `private` sein. Ausserdem kann der Rückgabewert auch weggelassen werden, falls es sch dabei um `void` handelt. 
```java
public class MyClass{
    public int attr1;
    public boolean attr2;
    
    public MyClass(int arg1){}
    private MyClass(){}
    
    public void method1(){}
    
    private String method2(String argv){return argv;}

}

___________________________________
|            MyClass              | <-------- Klassen Name
|-------------------------------  |
|  ⇩ Acces Modefier               |
|  +attr1 : int                   | <-------- Klassen Atribute
|  +attr2 : boolean <-- Datentyp  | 
|-------------------------------  |
|            ⇩ Paramether         |  
|  +MyClass(arg1 : int)           | <-------- Konstruktoren
|  -MyClass()                     |
|  +method1()     Rückgabewert ⇩  | <--------- Methoden
|  +method2(argv : String):String |
|_________________________________|
```

**Liste der Modefier:**

| Char | Modefier |
|---|---|
| `+` | `public` |
| `-` | `private` |
| `#` | `package` |
| `~` | package |


## B1F
In der objektorientierten Programmierung kommt es auch immer wieder vor, dass verschiedene Klassen Beziehungen untereinander eingehen. Natürlich müssen auch diese auf irgendeine Art und Weise im UML Diagramm abgebildet werden. 
### Assoziation
Assoziation kommen immer dann vor, wenn eine Klasse ein anderes Objekt als Instanzvariable abspeichert. Es wird mit einem einfach durchgehender Pfeil zwischen 2 Objekten gekennzeichnet. Am Ende des Pfeiles steht ein Wert, welcher angibt, um wieviele Objekte es sich handelt. 
```java
public class MyClass{
    private String s;
}
 ________________   ⇩ Anzahl
 |  MyClass     |   1            ___________
 |--------------| <>--------------|  String  |
 | -s : String  |                |__________|
 |______________|

````
### Angabe der Anzahl
Eine einfachen Assoziation (Verbindung) entsteht, wenn man z.B. bei der einen Klasse ein Attribut in Form von der anderen Klasse verwendet. Dabei gibt man bei einer Assoziation immer die Multiplizität an.
- **Genau X**<br/>
Um zu sagen, dass es sich genau um `X` Instanzen handelt, wird einfach die Zahl `X` zu der Verbindung dazugeschrieben. Ein Beispiel von einer solchen Verbindung wäre z.B.
<br/>

```java

public class Main{
    public final static Logger LOG = LoggerFactory.getLogger(Main.class);
}
```
- **Von X zu Y** <br/>
Um zu sagen, dass man eine variable Anzahl im Bereich von einer Range von Verbindungen hat, wird diese im Folgenden Syntax angegeben: `X..Y`. Ein Beispiel für eine solche Verbindung wäre
<br/>

```java
public class Main{
     private Ship[] ship = new Ship[5]; 
    //Getter and Setter
}
``` 

- **Beliebig**<br/>
Natürlich kann es sich auch um eine unbegrenzte Anzahl von Verbindungen handeln. Dies wird dann mit Hilfe des `*` dargestellt. 
<br/>

```java
public class Main{
    private Set<Ship> ship = new LinkedHashSet<Ship>();
    //Getter abd Setter
}

```

### `<<use>>` Bezihung
Sehr häufig kommt es auch vor, dass eine Klasse zwar ein Objekt in einer Methode verwendet, allerdings es nie als Instanzvariable abspeichert. Falls das vorkommt, kann das in einem UML Diagramm mit `<<use>>` dargestellt werden.

```java
public class DummyCass{
    public void createString(){
        String s = "s"; // <- Does use the String class but never als Instanzvariable
    }
} 
```

## B1E
Natürlich muss man auch Vererbung in einem UML Diagramm abbilden. Das kann man durch einen einfachen Pfeil mit einem weissen Pfeilkopf machen. Am Ende steht allerdings natürlich keine Zahl. Falls es sich bei der Parentklasse um eine abstrakte Klasse handelt, wird diese mit _kursiver schrift_ dargestellt. Das gilt nicht nur für Klassen, sondern auch für Methoden, welche abstrakt sind. Als letztes gibt es da noch die Interfaces. DIese werden mit einem `<<interface>>` über dem Klassnnamen dargestellt.
```java
public interface MyInt{}

___________________
|  <<interface>>  |
|      MyInt      |
|_________________|
```

# Umsetzung 
Wir hatten mehrere [UMLs](./../resources/uml) bei denen wir die **alle** oben beschriebenen Lernziele anwenden mussten. Allerdings habe ich dies nicht am Computer gemacht sondern von Hand skitziert. Ausserdem kamm es bei mehreren Aufgaben vor, dass wir anhand eines UMLs eine Klassenstruktur erstellen mussten z. B. [Polymorphie](./../resources/polymorphie)
