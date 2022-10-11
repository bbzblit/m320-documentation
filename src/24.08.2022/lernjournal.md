[Back to main Page](./../../README.md)

# Lernjournal 24.08.2022

## Was habe ich heute gemacht
- **Konstruktoren**<br/>
Wir haben im Unterricht gemeinsam angeschaut, wie ein Konstruktor in Java aufgebaut ist, und wozu er notwendig ist. Anschliessend hatten wir einen Auftrag, bei dem wir die Klasse [`Konto`](./../resources/fachklassen/index.md#konto) von letzter Woche um einen Konstruktor ertweitert, damit man nun eine Instanz mit einem Startguthaben erstellen kann. Zudem sollte man allerdings auch immer noch in der Lage sein, ein Konto ohne Guthaben zu erstellen. Ich konnte diese Aufgaben ohne grössere Schwierigkeiten lösen.
- **UML**<br/>
Wir haben anfangs gemeinsam in der Klasse angeschaut, was UML (Unified Modeling Language) bedeuted, und wie man damit Diagramme von Klassen und deren Beziehungen erstellen kann. Am Anfang einer "UML Klasse" steht immer der Klassenname. Anschliessend beginnt jede Zeile entweder mit einem `+` für `public` oder einem `-` für `private`. Danach kommt der Konstruktoren-, Methoden- oder Attributname. Am Ende der Zeile steht optional auch noch ein Rückgabewert. Bei Konstruktoren oder bei Rückgabewerten vom Typ `void` muss (bei Konstruktoren) respektive darf (Rückgabewerten) dieser allerdings nicht angegeben werden. 

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
Gegen Ende des Unterrichts habe ich noch ein bestehendes Diagramm in Java implementiert. Dabei sollten wir 3 Klassen [`Main`](./../resources/fachklassen/index.md#main), [`Ship`](./../resources/fachklassen/index.md#ship) und [`Competition`](./../resources/fachklassen/index.md#competition) implementieren. Die Methoden und Attribute der Klassen waren durch das Diagramm bereits vorgegeben. Das Einzige was anschliessend noch implementiert werden musste, war die Logik dahinter. 
- **UML Generator**
Da ich fürher fertig war mit den Aufgaben, habe ich damit begonnen einen UML Generator zu schreiben. Viele Tools besitzen zwar bereits eine Möglichkeit, um bestehenden Java Code in ein UML zu verwandeln. Allerdings ist dieser bei den von mir getesteten Tools immer kostenpflichtig. Aus diesem Grund, habe ich mich dazu entschieden, selbst eine Klasse zu implementieren, welche ein UML aus bestehenden Klassen generiert. So wurde also die Klasse [`UMLGenerator`](../../resources/fachklassen/index.md#uml-generator) erschaffen. Diese beinhaltet 2 öffentliche Methoden. Mit der Methode `generateUml(Class cls)` ist man in der Lage, ein UML von einer einzelnen Klasse zu erstellen. Mit der 2. Methode `generateUmlByPackage(String packagename)` ist man in der Lage, ein UML von allen Klassen und Subklassen von einem Package zu erstellen. Das Endergebnis sieht dann in etwa so aus
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
Am heutigen Tag habe ich dazugelernt, was UML ist und wie man aus Java Klassen Diagramme zeichnen kann. Ich denke, dass ich das Zeichnen von Diagrammen aus Java Klassen relativ gut verstanden habe und so auch bei einem echten Projekt anwenden könnte. 

## Ziele
In dieser Woche sind 3 neue Punkte (A1G, A1F und A1E) beim Schaufenster dazugekommen. Mein Ziel ist es nun, diese auf nächste Woche (oder zumindes so weit wie möglich) in meinem Schaufenster zu erledigen. 

## Reflektion
Ich denke, dass ich in dieser Woche sehr viel Neues - vorallem bezüglich UML - dazugelernt habe. Ich denke, dass ich beim Thema relativ gut mitgekommen bin und alles soweit verstanden habe.
## Schaufenster
In dieser Woche habe ich die Kompetenzen [`A1G`](./../schaufenster/HZ1.md#a1g) und [`A1F`](./../schaufenster/HZ1.md#a1f) erledigt.
