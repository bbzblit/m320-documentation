[Back to main Page](./../../README.md)

# Schaufenster HZ1

## A1G 
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
## A1F
### Verbindungen zwischen den Klassen
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
     private Ship ship = new Ship[5]; 
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