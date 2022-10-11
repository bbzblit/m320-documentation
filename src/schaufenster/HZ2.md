[Back to main Page](./../../README.md)

# Schaufenster HZ2

## B1G

UML (Unified Modeling Language) kann dazu verwendet werden, um die Strukturen von Klassen und deren Beziehungen untereinander in ein Diagramm zu fassen. Dabei wird in einem UML Diagram die komplete Struktur eines Programmes abgebildet nicht aber seine Logik.

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
