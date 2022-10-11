[Back to main Page](./../../README.md)

# Schaufenster HZ1

## A1G 
### Grundlagen OOP
Die Idee hinter Opjekt Orientierten Programmieren ist es, alles in Klassen zu speichern von denen jede Klasse seine eigene Aufgabe hat. Dabei kann jedes Objekt mit anderen Objekten über schnittstellen (methoden) komunizieren. Der Vorteil davon ist eine sehr grosse Austauschbarkeit und eine bessere Struktur. Falls man eine bestimmte Funktion vom Programm abändern möchte muss man nur wenige Klassen editieren oder gegebenfalls austauschen. Auch kann man durch das Hinzufügen von Objekten relativ schnell eine Applikation erweitern. Anderst als bei anderen Programmiersprachen wie `Python` oder auch `C++` wird man in Java quasi in das Objektorientierte Denken gezwungen. Dass sieht man z.B. daran, dass man kein Java Programm ohne mindestens eine Klasse erstellen kann <br/>
**Hello World Beispiele:**<br/>
**Java:**
```java
public class Main{ // <- Minimum Java Class
    public static void main(String ... args){
        System.out.println("Hello World"); 
   }
}
```
**C++**
```cpp
#include <iostream>

int main(int argc, char** argv) {
    std::cout << "Hello World" << std::endl;
    return 0;
}
```
**Python**
```python
print("Hello World")
```
Beim OOP ist die Idee, dass man zuerst überlegt welche Funkionen und dadurch Klassen ein Programm haben soll. Anschlissend kann man damit beginnen diese Klassen zu erstellen und zu Implementieren. Eine Möglichkeit um die ganzen Klassen zu Planen sind sogennante UMLs, welche ich im HZ2 behandle. 

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

## A1E
### Herangehensweise 
Wenn man ein neuses Projekt bekommt kann der Erfolg des Projektes an der Herangehensweise liegen. Genau das selbe gilt auch bei einem Programm. Es ist wichtig, dass man eine Herangehensweise findet, die für einen Passt und mit der man arbeiten kann. Ich habe für mich selber folgende Herangehensweise gefunden.
1. **Problem Analysieren und in Teilprobme zerlegen** <br/>
Als erstes lese ich mir die genaue Anforderung an das Programm durch. Danach versuche ich das grosse Problem in mehrere kleine Teilprobleme zu zerlegen. Dadurch ist es einfacher diese zu lösen und schlussendlich in Code zu fassen. Manchmal kann ich auch Teilprobleme mehrmals wiederverwenden woduch ich unnötige Redundanz verliere. Um das ganze anhand eines Beispieles genauer zu Verdeutlichen kann man die Aufgabe Pizza Backen nehmen. Ein Teilproblem währe in diesem Fall dann Teig machen oder auch Ofen einstellen usw.
2. **PseudoCode/UML** <br/>
Je nach grösse des Programmes beginne ich im nächsten Schrit damit, ein UML zu erstellen oder auch das ganze einmal in Pseudocode aufzuschreiben. In diesem Schritt defeniere ich dann auch zwingend wie die einzelnen Klassen miteinander zusammenspel oder wie die Vererbungshirarchie aussieht. 
3. **Coden**
Im letzen Schritt beginne ich damit, dass Programm herunter zu programmieren. Erst in diesem Schritt mache ich mir Gedanken zur Logik und wie ich die Teilprobleme lösen werde. 
