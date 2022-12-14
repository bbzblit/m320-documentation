[Back to main Page](./../../README.md)

# Schaufenster HZ3

## D1G
### Aufbau eine Klasse
Eine Klasse ist in Java immer gleich aufgebaut. Sie begint mit dem acces Modefier anschlissend kommt immer `class` gefolgt von dem Namen der Klasse und einer geschweifteten Klammer. 
```java
public class MyClass{
    //Code goes here
}
```
### Constructor
Eine Klasse in Java hat immer einen oder mehrere Konstruktoren. Defaultmässig wird immer ein Konstruktor ohne Parameter erstellt. Unter einem Konstruktor kann man sich einfach gesagt eine Methode vorstellen, die aufgerufen wird, wenn die Klasse initialisiert wird. Der Aufbau eines Konstruktors ist fast gleich wie der einer Methode. Der einzige Unterschied besteht darin, dass Konstruktoren **KEINEN** Rückgabewert haben (auch nicht `void`) und der Name immer der Klasse entspricht.

```java
public class MyClass{

   public MyClass( /* Args go here */ ){
        //Code goes here
   }

}

```

### Static
Methoden in Klassen können entwender `static` sein oder nicht. Der Unterschied besteht darin, dass statische Methoden global erreichbar sind. Dasselbe gilt auch für Attribute.
```java
public class MyClass{
  public static void staticMethod(){
      System.out.println("Hello Static Method")
  }
  
  public void classMethod(){
      System.out.println("Hello Class Method")
  }
  
  
}


public class Main{
  public static void main(String ... args){
      MyClass.staticMethod(); // -> "Hello Static Method"
      MyClass.classMethod(); // -> "Error"
      
      MyClass myClass = new MyClass();
      myClass.classMethod(); // -> "Hello Class Method"
  }

}

```

### Benutzen einer Klasse
Eine Klasse kann mit dem `new` Keyword initialisiert werden (`MyClass myClass = new MyClass()`). Anschliessend ist man in der Lage, auf nicht statische Variablen und  Methoden aus der Klasse zuzugreifen.

### Good Practice
1. Java Klassen sind in PascalCase geschrieben d.h. `MyClass` **nicht** `myClass` oder `my_class`
2. Klassenattribute sind in camelCase geschrieben (eine Ausnahme stellen Konstanten dar) d.h. `myAttribut` **nicht** `my-attribut` oder `my_attribut`
3. Attribute sollen **IMMER** auf privat gestellt werden. Man sollte über sie nur über sogenannte `Getter` und `Setter` zugreifen können.
### Umsetzung
Ich hab das oben Beschriebenen beispielhaft an der [Konto](./resources/index.md#konto) Klasse umgesetzt.

## D1F
Eine Klasse in Java kann nicht nur aus primitiven Datentypen bestehen. Ein gutes Beispiel dafür sind Strings, bei denen es sich ja auch um eine Klasse mit allem drum und dran handelt. Die einfachste Beziehung zwischen 2 Klassen stellt die `Assoziation` dar. Dabei wird eine Instanz von einem Objekt in einer anderen Klasse weiterverwendet. Ein Beispiel dafür währe die Klasse [`Weapon`](./../31.08.2022/resources/index.md#weapon). Diese hat 2 Attribute, bei einem dieser Attribute (`name`) handelt es sich um einen String.
Nun kann man natürlich auch selber erstellte Klassen wiederverwenden. Wie auch beim Attribut Name in der Klasse deklarieren, um nachher darauf Zugriff zu haben. 
 Das ganze habe ich auch diese Woche beispielhaft in einem Java [`Game`](./../31.08.2022/resources/) umgesetzt. Ich hab dazu auch ein kleines UML erstellt, um die Beziehungen zwischen den Klassen darzustellen.


## D1E 
Wenn 2 Klassen untereinander eine Beziehung haben, kommt es eigentlich immer vor, dass sie auch miteinander interagieren müssen. So kommt es z.B. vor, dass beim Aufrufen einer Methode weitere Methoden von anderen Klassen aufgerufen werden. In diesem kleinen Beispiel haben wir 2 Klassen (`A` und `B`). Die beiden Klassen haben eine Beziehung untereinander, die daraus besteht, dass die Klasse `A` ein Klassenattribut von `B` hat. Wenn wir nun an der Klasse `A` die Methode `.doSomething()` aufrufen, wird am Klassenattribut `b` auch gleich die Methode `.otherMethod()` aufgerufen. Dadurch interagiert die Klasse `A` mit der Klasse `B`  

```java
public class A{
    
    B b = new B();
    
    public void doSomething(){
        this.b.otherMethod();
    }
    
}

public class B{
    public void otherMethod(){}
}

```
### Kapselung
In Java kann man die Verwendung von Methoden, Konstruktoren oder auch Attributen in anderen Klassen einschränken oder gänzlich verbieten. In Java gibt es 4 verschiedene Accessmodefier, die man alle auswendig kennen sollte. Am häufigsten wird aber definitif Private und Public verwendet. 


| Modifier | Beschreibung |
|---|---|
| Public | Öffentlich bedeutet, dass die Objekte für alle Klassen in egal welchem Package verfügbar sind. Es ist auch der Access Modifier, der die Verwendung vom Objekt nicht einschränkt. <br/> _Der Access Modifier wird mit dem `public` keyword deklariert_ |
| Private | Privat bedeutet, dass das Objekt nur aus der eigenen Klasse heraus erreichbar ist. Private ist also quasi genau das Gegenteil von Public. <br/> _Der Access Modifier wird mit dem `private` keyword deklariert_ |
| Protected  | Mit Protected wird ein Objekt nur aus allen Klassen aus dem gleichen Package und Klassen, welche das besagte Objekt implementieren erreichbar. <br/> _Der Access Modifier wird mit dem `protected` keyword deklariert_ |
| Package | Package bedeutet, dass das Objekt **nur** aus dem gleichen Package heraus erreichbar ist.  <br/> _Der Access Modifier muss nicht mit einem Keyword deklariert werden. Alle Methoden/Konstruktoren und Attribute in Klassen sind von default her Package_ |

### Getter und Setter
Eine Folge von Kapselung in Java sind sogennante Getter und Setter. In Java gilt es grundsätzlich als good Practise, wenn man **NIEMALS** direkt auf Attribute in Klassen zugreift. Das hat den simplen Grund, dass man dadurch validieren kann, ob ein eingegebener Wert valide ist. In diesem Beispiel haben wir eine Klasse `Player` mit einem Attribut `health`. Nun wollen wir sicher stellen, dass `health` niemals unter 0 ist. Wenn `health` public wäre, könnte man mit `player.health = -1;` ganz einfach das Attribut `health` negatif setzen. In diesem Beispiel allerdings haben wir eine setter Methode, in der wir validieren, ob `health` auch wirklich einen valider Wert ist.


```java

public class Player{
    private int health = 100;
    
    public void setHealth(final int health){
        if(health <= 0){
            throw new IllegalArgumentException("Health has to be bigger than 0");
        }
        this.health = health;
    }
    
    public int getHealth(){
        return this.health;
    }
}
```


### Umsetzung
Ich habe das ganze anhand eines [Games](./../resources/mandi/) umgesetzt. Dabei hat man 2 Klassen (`Character` und `Fight`). Die Fight klasse Interagiert mit der Characer Klasse indem sie 2 Character immer gegeneinander kämpfen läst.

## D2G
Im Programmieren sollte man redundanten Code möglichst verhindern, da dieser aufwändig in der Wartungsarbeit ist und man auch im Falle, dass man etwas anpassen möchte, dies imemr an mehreren Stellen machen muss. Es kann vorkommen, dass man mehrere Klassen hat, die Methoden haben, welche in der Logik gleich sind. Ein Beispiel dafür wären die beiden Klassen `Car` und `Truck`.  Beide klassen haben in diesem Fall eine Methode `.starten()` oder auch eine Methode `.tanken()`. Nun könnte man natürlich 2 Verschiedene Klassen machen und 2 Mal die Methode implementieren.

```java
public class Car{
    public void tanken(){
        System.out.println("Tanke auf");
    }
}

public class Truck{
    public void tanken(){
        System.out.println("Tanke auf");
    }
}

```
Im Beispiel oben ist es kein Aufwand 2 Mal die Methode `.tanken()` zu schreiben. Nun könnte es aber auch sein, dass noch eine weitere Klasse `PKW` hinzukommt oder dass die Methode `.tanken()` nicht mehr benötigt wird. Nun wäre es natürlich praktisch, wenn es eine Möglichkeit gäbe, diese Methode nur einmal implementieren zu müssen. Dadurch könnte man leicht neue Klassen hinzufügen oder auch die Methode löschen, falls sie nicht mehr benötigt werden würde. In diesem Moment kommt Vererbung ins Spiel. In Java kann man Klassen vererben. Dadurch sind alle Methoden und Attribute von der Parentklasse auch automatisch in der Childklasse implementiert. In Java kann man eine Klasse in eine andere mit dem `extends` Keyword implementieren.

```java
public class Fahrzeug(){
    public void tanken(){
        System.out.println("Tanke auf");
    }
}

public class Car extends Fahrzeug{}

public class Truck extends Fahrzeug{}

```


### Implementieren von mehreren Klassen
In Java kann man **nicht** mehrere Klassen in eine Klasse vererben. Das liegt simpel daran, dass für den Fall, dass die beiden Klassen gleiche Methoden enthalten, der Compiler nicht entscheiden kann, welche er verwenden sollte. 

```java

public class A{
    public void randomMethod(){
        System.out.println("A");
    }
}
public class B{
   public void randomMethod(){
        System.out.println("B"); 
    }
}

public class C extend A,B{}

public class Main{
    public static void main(String ... args){
        C c = new C();
        c.randomMethod(); // -> doesnt know if it should print out A or B 
    }
}

```
In anderen Programmiersprachen wie `C++` oder auch `Python` ist es möglich, mehrere Klassen zu vererben. Allerdings habe ich es auch noch nie in einer Programmiersprache gebraucht.

### Umsetzung
Ich habe das ganze an einem [Beispielprojekt](./../resources/vererbung/) umgesetzt bei dem es darum geht verschiedene Autos zu verwalten. Es gibt eine Oberklasse `Car` und mehrere ChildKlassen wie `UsedCar` usw.

## D2F

Im Objekt Orientierten Programmieren unterscheidet mann zwischen `Dynamischer Polymorphie` und `Statischer Polymorphie`. 
- **Statische Polymorphie** <br/>
Bei Statischer Polymorphie werden Methoden oder auch Konstruktoren überladen. Dabei hat man mehrere Funktionen mit dem gleichen Namen. Sie unterscheiden sich nur darin, dass sie unterschiedliche Parameter haben. Welche Methode am Ende aufgerufen wird, entscheidet sich lediglich daran, welche Parameter mitgegeben werden.  

```java
public class StaticPolymorphie{
    public StaticPolymorphie(){}
    public StaticPolymorphie(String param){}
}
```
- **Dynamische Polymorphie**<br/>
Bei Dymaischer Polymorphie werden gleiche Methoden mit gleichen Parameter mehrmals implementiert. Das ist natürlich nur möglich wenn Vererbung vorhanden ist. Welche Methode am Ende aufgerufen wird, entscheidet sich dann daran, an welchem Objekt sie aufgerufen wird.

```java

public class A{
    public void print(){
        System.out.println("A");
    }
}

public class B extends A{
    @Overide
    public void print(){
        System.out.println("B");
    }
}
public class Main{
    public static void main(String ... args){
        A a = new A();
        a.print(); // Prints "A" beacause Inizalized class is A
        a = new B();
        a.print(); // Prints "B" beacause it is on runtime an Objekt of B class
    }
}
```
### Zusammenfassung
Dynamische und Statische Polymorphie unterscheidet sich darin, dass bei Statischer Polymorphie bereits bei Compilezeit feststeht welche Methode aufgerufen wird, wobei allerdings bei Dynamischer dies erst on runtime entschieden wird.

### Umsetzung
Ich habe das ganze an einem [Beispielprogramm](./../resources/polymorphie/) umgesetzt. bei habe ich Dynamische Polymorphie bei der  `.getPrice()` Methode verwendet. 

## D2E

### Abstrakte Klassen
Wie bereits im Kapitel D2G beschrieben geht es immer darum, möglichst erweiterbaren und gut wartbaren Code zu schreiben. Aus diesem Grund gibt es Vererbung zwischen Klassen. Wie bereits beschrieben, kann man dadurch ganz einfach die Logik und die Struktur von einer Klasse in mehreren Klassen Weiterverwenden. Nun gibt es aber auch Szenarien, bei denen wir nur die Struktur übernehmen möchten.
Um einmal auf das Beispiel mit der Methode `.tanken()` zurückzukehren, könnte man nun 2 Klassen `Car` und `ElectroCar` implementieren wollen. Schnell sollte auffallen, dass man logischerweise ein Elektorauto anders betankt als ein konventionelles Auto. Nun könnte man natürlich wieder 2 verschiedene Klassen implementieren, die nichts miteinander zu tun haben.
```java

public class Car{
    public void tanken(){
        System.out.println("tanke benzien");
    }
        
    public void hupen(){
        System.out.println("hupe");
    }
}

public class ElectroCar{
    public void tanken(){
        System.out.println("tanke strom");
    }
    
    public void hupen(){
        System.out.println("hupe");
    }
}

```
Der Code würde theoretisch funktionieren, allerdings ist er weder gut wartbar, noch skalierbar. Zudem fällt auf, dass beide Klassen eine Methode `.hupen()` haben. Diese verändert sich von der Logik her nicht und bleibt in beiden Klassen gleich. Auch hier wäre es praktisch eine Möglichkeit zu haben, diese weiterzuverwenden. 
Die lösung dafür sind Abstrakte Klassen. Abstrakte Klassen können mit dem `abstract` Keyword erstellt werden. Sie zeichnen sich dadurch aus, dass sie nicht initalisiert werden können, und dass eine Methode in ihr auch Abstrakt gesetzt werden kann. Abstrakte Methoden haben keinen Body und dadurch auch keine Logik. Das Implementieren der Logik ist dann Sache der nächsten Childklasse, welche **nicht** abstrakt ist. 

```java
public abstract class Fahrzeug{

    public abstract void tanken();

    public void hupen(){
        System.out.println("hupe");
    }
}
public class Car extends Fahrzeug{
    @Override
    public void tanken(){
        System.out.println("tanke benzien");
    }
}

public class ElectroCar extends Fahrzeug{
    @Override
    public void tanken(){
        System.out.println("tanke strom");
    }
}
```

### Umsetzung
Ich hab das ganze dadurch umgesetzt, dass ich in einer Gruppe das bestehende Game so angepasst habe, dass neu die Klasse [Car](./../resources/abstract/index.md#umsetzung) abstrakt ist. Ausserdem haben wir die Methode `.getPrice()` abstract gesetzt, da sich diese bei einem CrashedCar anderst berechnet als bin einem UsedCar.

### Interfaces
Manchmal kommt es auch vor, dass man gar keine Logik implementieren möchte. In diesen Fällen könnte man natürlich die gesamte Klasse theoretisch einfach Abstrakt machen. Man könnte allerdings auch zu einem Interface greifen. Alle Methoden in einem Interface sind von default `public` und `abstract`. Interfaces können in Java mit dem `interface` Keyword erstellt werden. Wie auch bei Klassen muss das File in dem das Interface ist gleich heissen und es kann auch nur maximal 1 Interface pro File exisitieren.

```java
//DummyInterface.java
public interface DummyInterface{
}
```

Wenn man nun ein Interface in einer anderen Klasse einbinden möchte, kann man das `implements` keyword verwenden. In Java kann man "theoretisch" (die Java VM hat immer irgendwo Limiten) viele Interfaces einbinden. Darin besteht auch ein Vorteil gegenüber von Klassen. Der Grund warum das möglich ist, ist ganz einfach. Interfaces beinhalteten **nur** die Struktur und keine Logik. Dadurch muss der JavaCompiler nicht zwischen 2 verschiedenen Codeblöcken entscheiden. 

```java
public class Fahrzeug{
    public void tanken();
}

public class Car implements Fahrzeug{
    @Override
    public void tanken(){
        System.out.println("Tanke auf");
    }
}

```

### Beispiele von Interfaces
In Java gibt es ein Interface `java.util.List`. Dies ist ein Interface, welches die gesamte Struktur für eine Liste Implementiert. Z.b gibt es eine Methode `.add(Object)` mit dessen Hilfe man ein Objekt an der Liste anfügen kann. Nun gibt es allerdings mehrere Möglichkeiten, wie man eine Liste implementieren kann. Zum einen gibt es da die `ArrayList`, welche kurz gesagt einfach ein normaler JavaArray ist. Die andere Möglichkeit ist eine `LinkedList`. Bei ihr hat jedes Element in der Liste 2 Pointer. Einer davon zeigt auf das Element davor, der andere auf das nächste Element in der Liste. 
Nun könnte es natürlich vorkommen, dass man sich während dem Entwicklen dazu entscheidet, dass doch eine `LinkedList` sinvoller wäre als eine `ArrayList`. Wenn man nun eine `List` als Datentyp gewählt hat, kann man das ganz einfach und schnell austauschen.

```java
public class Main{
    public static void main(String ... args){
        List<String> list = new ArrayList<String>();
    }
}
```
### Umsetzung
Ich habe das ganze zusammen in einem Team umgesetzt. Wir haben das bereits bestehende [Game](./../resources/interfaces/index.md#wichtigste-klasse) so angepasst, das es nun Interface `Waffen` gibt. Dieses definiert wie eine Waffe aufgebaut ist. Nun kann man mehrere Childklassen erstellen, bei denenen jede Childklasse eine eigene Waffe implementiert z.B. Schwert usw.
