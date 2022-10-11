[Back to main Page](./../../README.md)

# Lernjournal

## Was habe ich gemacht?
- **Besprechen des Lernjournales** <br/>
Wir haben in einem 1 zu 1 Gespräch besprochen, was wir am Lernjournal noch verbessern können. Bei mir kam heraus, dass ich in den Ressources mehr Arbeitsaufgaben und Präsentationen hochladen sollte. Ich habe mir daraufhin auch noch einmal Gedanken zu meiner Filestruktur gemacht. Ich habe als Entschluss daraus dann die Ressourcen nicht mehr wöchentlich, sondern neu pro Thema strukturiert.
- **Weiterarbeiten am Schaufenster** <br/>
Wir haben Zeit bekommen, um weiter an unserem Schaufenster zu arbeiten. 
- **Erweiterung des Games** <br/>
Ich habe das Game so erweitert, dass man nun Waffen hat, die man benutzen kann. Diese Waffen haben je eine eigene Klasse. So gibt es z.B. eine Klasse `Axt` oder auch eine Klasse `Sword`. Alle diese Waffenklassen erben von einem einzigen Interface `Waffe`. Der Vorteil davon ist es, dass man ohne grössere Schwierigkeiten eine neue Waffe hinzufügen kann. 

```java
public interface Waffe{
  public int use(int ap);
}

public class Sword implements Waffe{
  
  @Override
  public int use(int ap){
      //Logik to use a sword
  }
}

```

## Reflexion
Ich denke, dass ich in der letzten Woche gut vorangekommen bin. Ich konnte alle Aufgaben lösen. Ausserdem habe ich schon einmal eine erste Rückmeldung bezüglich meines Lernjournales erhalten. 

## Ziele
Meine Ziele sind es, alle Kompetenzen im Schaufenster sauber zu erstellen. Ausserdem möchte ich die Vorschläge bezüglich des Lernjournales umsetzen.
