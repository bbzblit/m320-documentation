# Lernjournal

## Was habe ich gemacht?
- **Besprechen des Lernjournales** <br/>
Wir haben in einem 1 zu 1 Gespräch besprochen, was wir am Lernjournal noch verbessern können. Bei mir kam heraus, dass ich in den Resources mehr Arbeitsaufgaben und Präsentationen hochladen sollte. Ich habe mir daraufhin auch nocheinmal Gedanken zu meiner Filestruktur gemacht. Ich habe als Entschluss daraus dann die Resources nichtmehr wöchtentlich sondern neu pro Thema strukturiert.
- **Weiterarbeiten am Schaufenster** <br/>
Wir haben Zeit bekommen um weiter an userem Schaufenster zu arbeiten. 
- **Erweiterung des Games** <br/>
Ich habe das Game so erweitert, dass man nun Waffen hat die man Benutzen kann. Diese Waffen haben je eine eigne Klasse. So giebt es z.B. eine Klasse `Axt` oder auch eine Klasse `Sword`. Alle diese Waffenklassen erben von einen einzigen Interface `Waffe`. Der Vorteil davon ist es, dass man ohne grössere Schwierrigkeiten eine neue Waffe hinzufügen kann. 

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
