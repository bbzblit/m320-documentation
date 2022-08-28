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
- **Mehrere Fachklassen**
Gegen Ende des Unterrichtes habe ich noch anhand eines bestehenden Diagrams dieses in Java Implementiert. Dabei sollten wir 3 Klassen [`Main`](./resources/index.md#main), [`Ship`](./resources/index.md#ship) und [`Competition`](./resources/index.md#competition) implementieren. Die Methoden und Attribute der Klassen waren durch das Diagram bereits vorgegeben. Das einzige was anschliessend noch Implementiert werden musste war die Logik dahinter. 
- **UML Generator**
Da ich fürher fertig war mit den Aufgaben habe ich mich noch drangemacht einen UML Generator zu schreiben. Viele Tools besitzen zwar bereits eine Möglchkeit um bestehenden Java Code in ein UML zu verwandeln. Allerdings ist dieser bei den von mir getesteten Tools immer Kostenpflichtig. Aus diesem Grund habe ich mich dazu entschieden selbst eine Klasse zu implementieren, welche ein UML aus bestehenden Klassen generiert. So wurde also die Klasse [`UMLGenerator`](./resources/index.md#uml-generator) erschaffen. Dieser beinhalted 2 öffentliche Methoden. Mit der Methode `generateUml(Class cls)` ist man in der Lage, ein UML von einer einzelnen Klasse zu erstellen. Mit der 2. Methode `generateUmlByPackage(String packagename)` ist man in der Lage ein UML von allen Klassen und Subklassen von einem Package zu erstellen. Das Endergebniss sieht dann in etwa so aus
```
**************************************
Package: dev.bbzbl.m320
Name: Ship
---
-nummer : int
-name : String
-time : int
---
+Ship(arg0 : int arg1 : String )
+getName() : String
+setName(arg0 : String ) : void
+getTime() : int
+setNummer(arg0 : int ) : void
+getNummer() : int
+race() : void
**************************************
```
## Was ist mir heute klar geworden?
Am heutigen Tag, habe ich dazugelernt, was UML ist und wie man aus Java Klassen Diagramme zeichnen kann. Ich denke, dass ich das Zeichnen von Diagrammen aus Java Klasen relativ gut verstanden habe und so auch bei einem echten Projekt anwenden könnte. 

## Ziele
In dieser Woche sind 3 neue Punkte (A1G, A1F und A1E) beim Schaufenster dazugekommen. Mein Ziel ist es nun, diese auf nächste Woche (oder zumindes so weit wie möglich) in meinem Schaufenster zu erledigen. 

## Reflektion
Ich denke, dass ich in dieser Woche sehr viel neues vorallem bezüglich UML dazugelernt habe. Ich denke, dass ich beim Thema relativ gut mitgekommen bin und alles soweit verstanden habe.
