# Schaufenster 17.08.2022

## D1G
### Aufbau eine Klasse
Eine Klasse ist in Java immer gleich aufgebaut. Sie begint mit dem acces Modefier anschlissend kommt immer `class` gefolgt von dem Namen der Klasse und einer geschweifteten Klammer. 
```java
public class MyClass{
    //Code goes here
}
```
### Constructor
Eine Klasse in Java hat immer einen oder mehrere Konstruktoren. Defaultmässig wird immer einen Konstruktor ohne Parameter erstellt. Unter einem Konstruktor kann man sich einfach gesagt eine Metho vorstellen, die aufgerufen wird, wenn die Klasse Inizialisiert wird. Der Aufbau eines Konstruktors ist fast gleich wie der einer Methode. Der einzige Unterschied besteht darin, dass Konstruktoren **KEINEN** Rückgabewert haben (Auch nicht `void`) und der Name immer des der Klasse entspricht.

```java
public class MyClass{

   public MyClass( /* Args go here */ ){
        //Code goes here
   }

}

```

### Static
Methode in Klassen können etwender `static` sein oder nicht. Der Unterschied besteht darin, dass statische Methoden global Erreichbar. Dass selbe gilt auch für Attribute.
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
      MyClass.staticMethod(); -> "Hello Static Method"
      MyClass.classMethod(); -> "Error"
      
      MyClass myClass = new MyClass();
      myClass(); -> "Hello Class Method"
  }

}

```

### Benutzen einer Klasse
Eine Klasse kann mit dem `new` Keyword inialized werden (`MyClass myClass = new MyClass()`). Anschlissend ist man in der Lage auf nicht statische variablen und  Methoden aus der Klasse zuzugreifen.

### Good Practice
1. Java Klassen sind in PascalCase geschrieben d.h. `MyClass` **nicht** `myClass` oder `my_class`
2. Klassen Attribute sind in camelCase geschrieben (eine Ausnahme stellen Konstruktoren dar) d.h. `myAttribut` **nicht** `my-attribut` oder `my_attribut`
3. Attribute sollte **IMMER** auf private gestellt werden. Man sollte über sie nur über sogenannte `Getter` und `Setter` zugreifen können.
### Umsetzung
Ich hab das ganze oben beschriebenen Beispielhaft an der [Konto](./resources/index.md#konto) Kasse umgesetzt.
