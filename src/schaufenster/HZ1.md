[Back to main Page](./../../README.md)

# Schaufenster HZ1

## A1G 
### Grundlagen OOP
Die Idee hinter objektorientiertem Programmieren ist es, alles in Klassen zu speichern von denen jede Klasse seine eigene Aufgabe hat. Dabei kann jedes Objekt mit anderen Objekten über Schnittstellen (Methoden) kommunizieren. Der Vorteil davon ist eine sehr grosse Austauschbarkeit der Klassen und eine bessere Struktur. Falls man eine bestimmte Funktion vom Programm abändern möchte, muss man nur wenige Klassen editieren oder gegebenfalls austauschen. Auch kann man durch das Hinzufügen von Objekten relativ schnell eine Applikation erweitern. Anders als bei anderen Programmiersprachen, wie `Python` oder auch `C++`, wird man in Java quasi in das objektorientierte Denken gezwungen. Das sieht man z.B. daran, dass man kein Java Programme ohne mindestens eine Klasse erstellen kann <br/>
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
Beim OOP ist die Idee, dass man zuerst überlegt welche Funkionen und dadurch Klassen ein Programm haben soll. Anschliessend kann man damit beginnen, diese Klassen zu erstellen und zu implementieren. Eine Möglichkeit, um die ganzen Klassen zu planen sind sogennante UMLs, welche ich im HZ2 behandle. 

## A1F

Im OOP Kontext kommt es immer wieder vor, dass einzelne Klassen miteinander interagieren. Wie bereits beschrieben ist eine Klasse immer für ein einzelnes Teilproblem zuständig. Dadurch sollte es schon nach dem zerlegen des Problemes in mehrere Teilprobleme klar sein, wie die Klassen untereinander interagieren müssen. Es kann sehr hilfreich sein, wenn man das Ganze in einem UML Diagramm darstellt, damit man nicht die Übersicht über alle Klassen verliert.


## A1E
### Herangehensweise 
Wenn man ein neues Projekt bekommt, kann der Erfolg des Projektes an der Herangehensweise liegen. Genau dasselbe gilt auch bei einem Programm. Es ist wichtig, dass man eine Herangehensweise findet, die für die Person ppasst und mit der man arbeiten kann. Ich habe für mich selber folgende Herangehensweise gefunden.
1. **Problem analysieren und in Teilprobleme zerlegen** <br/>
Als erstes lese ich mir die genaue Anforderung an das Programm durch. Danach versuche ich das grosse Problem in mehrere kleine Teilprobleme zu zerlegen. Dadurch ist es einfacher diese zu lösen und schlussendlich in Code zu fassen. Manchmal kann ich auch Teilprobleme mehrmals wiederverwenden, woduch ich unnötige Redundanz vermeide. Um das Ganze anhand eines Beispieles genauer zu verdeutlichen, kann man die Aufgabe Pizza backen nehmen. Ein Teilproblem wäre in diesem Fall dann Teig machen oder auch Ofen einstellen usw.
2. **PseudoCode/UML** <br/>
Je nach Grösse des Programmes beginne ich im nächsten Schritt damit, ein UML zu erstellen oder auch das Ganze einmal in Pseudocode aufzuschreiben. In diesem Schritt definiere ich dann auch zwingend, wie die einzelnen Klassen miteinander zusammenspielen oder wie die Vererbungshierarchie aussieht. 
3. **Coden**
Im letzen Schritt beginne ich damit, das Programm herunter zu programmieren. Erst in diesem Schritt mache ich mir Gedanken zur Logik und wie ich die Teilprobleme lösen werde. 

# Umsetzung
Ich habe versucht die Oben beschriebenen Methoden in all meinen Projekten anzuwenden. Teilweise hatte ich damit erfolg. Es kam aber auch immer wieder vor, dass ich die ersten schritte übersprungen habe und direckt mit dem Coden angefangen habe. 
