[Back to main Page](./../../README.md)

# Lernjournal 24.08.2022

## Was habe ich heute gemacht
- **Konstruktoren**<br/>
Wir haben in gemeinsam angeschaut, wie ein Konstruktor in Java aufgebaut ist, und wozu er notwendig ist. Anschlissend hatten wir einen Auftrag, bei dem wir die Klasse [`Konto`](./../17.08.2022/resources/index.md#konto) von letzter Woche um einen Konstruktor ertweitert, damit man nun eine Instanz mit einem Startguthaben erstellen kann. Zudem sollte man allerdings auch immernoch in der Lage sein ein Konto ohne Guthaben zu erstellen. Ich konnte diese Aufgaben ohne Grössere Schwierigkeiten lösen.
- **UML**<br/>
Wir haben Anfangs gemeinsam in der Klasse angeschaut, was UML (Unified Modeling Language) bedeuted, und wie man damit Diagramma von Klassen und deren Bezihungen erstellen kann. Am Anfang einer "UML Klasse" steht immer der Klassenname. Anschlissend beginnt jede Zeihle entweder mit einem `+` für `public` oder einem `-` für `private`. Anschlissend kommt der Konstruktor/Methoden oder Attributname. Am Ende der Zeihle steht optional auch noch einen Rückgabewert. Beim Konstruktoren oder beim Rückgabewert `void` muss/darf dieser allerdings nicht angegeben werden. 

```
_________________________ 
|      <Class Name>     |
|-----------------------|
|(+/-)<name> : <type>   |
|(+/-)<name> : <type>   |
|---------------------- |
|(+/-)<cons. name>      |
|(+/-)<name> : <type>   | 
|(+/-)<name> : <type>   |
|_______________________|


_________________________
|      <Class Name>     |
|-----------------------|
|       Attribute       |
|---------------------- |
|      Konstruktoren    |
|                       | 
|        Methoden       |
|_______________________|
```


