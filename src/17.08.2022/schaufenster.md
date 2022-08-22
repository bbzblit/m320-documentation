[Back to main Page](./../../README.md)

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
