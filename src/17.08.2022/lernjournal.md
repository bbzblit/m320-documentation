[Back to main Page](./../../README.md)

# Lernjournal 17.08.2022

## Meine Vorkentnisse
Ich arbeite seit etwa 3/4 Jahren am Backend einer Webapplication. Für das Backend wird das Java Framework `Spring Boot` verwendet. Aus diesem Grund kenne ich mich bereits relativ gut mit OOP in Java aus. Ich vermute, dass relativ viel von dem was wir anschauen werden Repetition sein wird. Dennoch erhoffe ich mir vom Modul, dass ich auch ein paar neue Erkentnise daraus mitnehmen werde. 

## Was habe ich heute gemacht
- **Repetition der Grundlagen**
  Anhand eines Beispielprojektes haben wir die Grundlagen von Java (welche wir im letzen Modul gelernt haben) repetiert. Die Aufgabe war es, ein simples Programm zu schreiben, das ein Bankkonto verwaltet. Der User sollte in der Lage sein, Geld von seinem Konto abzuheben und welches darauf zuzahlen sie den aktuellen Kontostand anzuzeigen. Dabei musste das Programm nicht objektorientiert geschrieben sein. 

- **Schreiben des Programmes im OOP Context**  
  Die nächste Arbeit war es, das ganze Programm in OOP umzuschreiben. Um das zu realisieren, habe ich eine Klasse `Konto` erstellt, welche die gesamte Logik enthält. Diese Aufgabe konnte ich aufgrund meiner Vorkenntnisse relativ schnell und ohne grössere Probleme lösen. 
 
- **Repetition Datamanagment von Java**
Auch wurde kurz repetiert, wie Variablen in Java im Arbeitsspeicher gespeichert werden. Zwar war mir auch das bereits bewusst, dennoch fand ich es eine gute Repetition.
Das Wichtigste daran ist die Tatsache, warum man **nur** primitive Datentypen in Java mit dem `==` Operator vergleichen kann. In Java gibt es einen Stack und einen Heap. Alle deklarierten Variabelen werden auf dem Stack gespeichert. Bei allen primitiven Datentypen steht hinter der Variable auch gleich der Wert der Variable. Bei komplexen Datentypen wird ein neues Objekt auf dem Heap angelegt. Anschliessend wird ein Referenzwert auf dem Stack gespeichert. Der `==` Operator überprüft in Java allerdings lediglich auf Gleichheit vom Wert, welcher auf dem Stack gespeichert ist. Aus diesem Grund ist ein  `==` Vergleich in den meisten Fällen immer `false`. Deshalb sollte man Objekte immer mit der `.equals()` Method vergleichen. Bei der `.equals()` Methode, handelt es sich um eine Methode, welche von der `java.lang.Object` Klasse geerbt wird und benutzt werden kann, um selber einen equals Vergleich zu implementieren.

```
Stack                           Heap
myInt    | 123                  ______________
myObject | @f2a4d -----------> | @f2a4d       |
                               |--------------|
                               | var1 321     |
                               |______________|
```

## Was ist mir heute klar geworden? 
Am heutigen Tag habe ich nichts absolut Neues dazugelernt. Das liegt daran, dass ich die behandelten Themen bereits bei der Lehrfirma seit einiger Zeit anwenden darf und damit beherrsche. Die ersten beiden behandelten Themen waren damit Repetition für mich. Das Datamanagement in Java fand ich interessanter. Auch hier gab es einige Dinge, die ich schon kannte. Aber ich hatte bisher weniger praktische Erfahrungen in diesem Bereich.

## Ziele
Mein Ziel ist es, dieses Modul auch mit einem 6er abzuschliessen. Um das zu erreichen, nehme ich mir vor, immer voll dabei zu sein, egal ob es um Repetition oder um neue Themen geht. Ausserdem nehme ich mir vor, immer mein Lernjournal sauber und rechtzeitig zu schreiben.

## Reflektion
Diese Woche war mehrheitlich Repetition. Aus diesem Grund konnte ich meine Aufgaben schnell und ohne Probleme erledigen. Die Themen machen mir aber Spass. Ich freue mich auf die kommenden Stunden.  
