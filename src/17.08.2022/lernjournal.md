# Lernjournal 17.08.2022


## Meine Vorkentnisse
Ich arbeite seit etwa 3/4 Jahren am Backed einer Webapplication. Für das Backend wird Java framework `Spring Boot` verwendet. Aus diesem Grund kenne ich mich bereits relativ gut mit OOP in Java aus. Ich vermuete, dass relativ viel von dem wo wir anschauen werden repetition ist. Denoch erhoffe ich mir vom Modul, dass ich auch ein paar neue Erkentnise daraus mitnehmen werde. 

## Was habe ich heute gemacht
- **Repetition der Grundlagen**
  Anhand eines Beispielprojektes habe wir die Grundlagen von Java (Welche wir im letzen Modul gelernt haben) repetiert. Die Aufgabe war es, ein simples Programm zu schreiben, das ein Bankkonto verwaltet. Der User sollte in der Lage sein, Geld von seinem Konto Abzuheben und welches Draufzuzahlen und den aktuellen Kontostand anzuzeigen. Dabei musste das Programm nicht Objektorientiert geschrieben sein. 

- **Schreiben des Programmes im OOP Context**  
  Die nächste Arbeit war es, dass ganze Programm in OOP umzuschreieben. Um das zu realisieren habe ich eie Klasse `Konto` erstellt, welche die gesame Logik enthält. Diese Aufgabe konnte ich aufgrund meiner Vorkentnisse relativ schnell und ohne grössere Probleme lösen. 
 
- **Repetition Datamanagment von Java**
Auch wurde kurz Repetiert, wie Variablen in Java im Arbeitsspeicher gespeichert werden. Zwar war mir auch dass bereis bewusst, denoch fand ich es eine gute Repetition.
Das wichtigste daran ist die Tatsache , warum man **nur** primitive Datentypen in Java mit dem `==` Operator vergleichen kann. In Java gibt es einen Stack und einen Heab. Alle Deklariereten Variabelen werden auf dem Stack gespeichert. Bei allen Primitiven Datentypen steht hinter der Variable auch gleich den Wert der Variable. Bei Komplexen Datentypen wird ein neues Object auf dem Heap angelegt. Anschlissend wird einen Referenzwert auf dem Stackgespeichert. Der `==` Operator überprüft in Java allerdings lediglich auf gleicheit von Wert welcher auf dem Stack gespeichert ist. Aus diesem Grund ist eine  `==` Vergleich in den meisten Fällen immer `false`. Aus diesem Grund sollte man Objekte immer mit der `.equals()` Method vergleichen. Bei der `.equals()` Methode die von der `java.lang.Object` Klasse geert wird. Diese kan anschlissend vom ersteller der Klase so geschrieben werden, dass es auf Gleichheit der Variablen und nicht auf gleichheit der Referenz überprüft.

```
Stack                           Heap
myInt    | 123                  ______________
myObject | @f2a4d -----------> | @f2a4d       |
                               |--------------|
                               | var1 321     |
                               |______________|
```

## Was ist mir heute klar geworden? 
Am heutigen Tag, habe ich nichts dazugelernt. Das liegt ledigilich daran, dass ich alle Behandelten Themen bereits ohne Probleme behersche. Die ersten beiden Behandelten Themen waren wirklich Repetition auf einem ganz tiefen Niveau. Die Repetition vom Datamanagement in Java fand ich dann schon etwas interesanter. 

## Ziele
Mein Ziel ist es, dieses Modul auch mit einem 6er abzuschliessen. Um das zu erreichen neheme ich mir vor immer voll dabei zu sein (auch wenn es sich nur um Repetition handelt). Ausserdem nehme ich mir vor, immer mein Lernjournal sauber und rechtzeitig zu schreiben.

## Reflektion
Diese Woche war eigentlich nur reihne Repetition. Aus diesem Grund konnte ich meine Aufgaben schnell und ohne Probleme erledigen.  
