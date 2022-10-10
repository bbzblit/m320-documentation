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
Wenn 2 Klassen untereinander eine Beziehung haben kommt es eigentlich immer vor, dass sie auch miteinander interagieren müssen. So kommt es z.B. vor, dass beim aufrufen einer Methode weitere Methoden von anderen Klassen aufgerufen werden. In diesem kleinen Beispiel haben wir 2 Klasse (`A` und `B`). Die beiden Klassen haben eine Beziehung untereinander, die daraus besteht, dass die Klasse ein KLassenatribut von `B` hat. Wenn wir nun an der Klasse `A` die Methode `.doSomething()` aufrufen wird an dem Klassenattribut `b` auch gleich die Methode `.otherMethod()` aufgerufen. Dadurch interagiert die Klasse `A` mit der Klasse `B`  

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
In Java kann man die Verwendung von Methoden, Konstruktoren oder auch Attributen in anderen Klassen einschränken oder gänzlich verbieten. In Java gibt es 4 verschiedene Accessmodefiere, die man alle auswendig kennen sollte. Am häufigsten wird aber definitif Private und Public verwendet. 


| Modefiere | Beschreibung |
|---|---|
| Public | Öffentlich bedeutet, dass die Objekt für alle Klassen in egal welchem Package verfügbar sind. Er ist auch der Access Modefiere, der die Verwendung nicht einschränkt <br/> _Er wird mit dem `public` keyword deklariert_ |
| Private | Private bedeutet, dass das Objekt nur aus der eigenen Klasse heraus erreichbar ist. Er ist also quasi genau das gegenteil von Public. <br/> _Er wird mit dem `private` keyword deklariert_ |
| Protected  | Mit Protected wird ein Objekt nur aus allen Klassen aus dem gleichen Package und Klassen welche das besagte Objekt implementieren her erreichbar. <br/> _Er wird mit dem `protected` keyword deklariert_ |
| Package | Package bedeutet, dass das Objekt **nur** aus dem gleichen Package heraus erreichbar ist.  <br/> _Er muss nicht mit einem Keyword deklariert werden alle Methoden/Konstruktoren und Attribute in Klassen sind von default her Package_ |

### Getter und Setter
Eine Folge von Kapselung in Java sind sogennante Getter und Setter. In Java gilt es grundsätlich als good Practise wenn man **NIEMALS** direckt auf Attribute in Klasse zugreift. Das hat den Simplen Grund, dass man dadurh validieren kann ob ein eingegeben Wert valid ist. In diesem Beispiel z.B. haben wir eine Klasse `Player` mit einem Attribut `health`. Nun wollen wir sicher stellen, dass `health` niemals unter 0 ist. Wenn `health` public währe könnte man mit `player.health = -1;` ganz einfach das Attribut `health` negatif setzen. In diesem Beispiel allerdings haben wir eine setter Methode, in der wir Validieren, ob `health` auch wirklich einen valider Wert ist.


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

## D2G
Im Programmieren sollte man Redundanter Code möglichst verhindern, da dieser aufwändig zum Warten ist und man auch im Falle, dass man etwas anpassen möchte dieses imemr an mehreren Stellen machen muss. Es kann vorkommen, dass man mehrere Klassen haben, die Methoden haben, welche in der Logik gleich sind. Ein Beispiel dafür währen die beiden Klassen `Car` und `Truck`.  Beide klassen haben in diesem Fall eine Methode `.starten()` oder auch eine Methode `.tanken()`. Nun könnte man natürlich 2 Verschiedene Klassen machen und 2 mal die Methode implementieren.

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
In dem Beispiel oben ist es kein Aufwand 2 mal die Methode `.tanken()` zu schreiben. Nun könnte es aber auch sein dass noch eine weitere Klasse `PKW` hinzukommt oder dass die Methode `.tanken()` nichtmehr benötigt wird. Nun währe es natürlich praktisch wenn es eine Möglichkeit gäbe diese Methode nur einmal implementieren zu müssen. Dadurch könnte man leicht neue Klassen hinzufügen oder auch die Methode löschen falls sie nichtmehr benötigt werden würde. In diesem Moment kommt Vererbung ins Spiel. In Java kann man Klassen vererben. Dadurch sind alle Methoden und Attribute von der Parentklasse auch autmatisch in der Childklasse implementiert. In Java kann man eine Klasse in eine andere mit dem `extends` Keyword implementieren.

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
In Java kann man **nicht** mehrere Klassen in einer Klasse vererben. Das liegt simpel daran, dass für den Fall, dass die beiden Klassen gleiche Methoden enthalten der Compiler nicht entscheiden kann welche er verwenden sollte. 

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
In anderen Programmiersprachen wie `C++` oder auch `Python` ist es möglich mehrere Klassen zu vererben. ALlerdings habe ich es auch noch in keiner von denen Programmiersprachen gebraucht.

## D2F

Im Objekt Orientierten Programmieren unterscheidet mann zwischen `Dynamischer Polymorphie` und `Statischer Polymorphie`. 
- **Statische Polymorphie** <br/>
Bei Sttaischer Polymorphie werden Methoden oder auch Konstruktoren überladen. Dabei hat man mehrere Funktionen mit dem gleichen namen. Sie unterscheiden sich nur darin, dass sie unterschiedliche Parameter haben. Welche Methode am Ende aufgerufen wird entscheidet sich lediglich daran, welche Parameter mitgegeben werden.  

```java
public class StaticPolymorphie{
    public StaticPolymorphie(){}
    public StaticPolymorphie(String param){}
}
```
- **Dynamische Polymorphie**<br/>
Bei Dymaischer Polymorphie werden gleiche Methoden mit gleichen Parameter mehrmals implementiert. Das ist natürlich nur möglich wenn Vererbung vorhanden ist. Welche Methode am Ende aufgerufen wird entscheidet sich dann daran, an welchem Objekt sie aufgerufen wird.

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
Dynamische und Statische Polymorphie unterscheidet sich darin, dass bei Statischer Polymorphie bereits bei Compilezeit feststeht welche Methode aufgerufen wird wobei allerdings bei Dynamischer dies erst on runtime entschcieden wird.
