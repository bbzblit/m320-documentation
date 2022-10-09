[Back to main Page](./../../README.md)

# Schaufenster HZ2

## C1G Verwendungszweck von JavaDoc <br/>
Java Doc ist eine Möglichkeit um Sourcecode in Java zu dokumentieren. Dabei wird die Dokumentation direckt im Editor geschrieben. Das spart nicht nur Zeit und Ressourcen, sondern ist auch für den Leser der Dokumentation viel angenehmer. In grösseren Projekten verwendet man gerne mal mehrere externe Librarys wie z.B. `Spring Boot` und `Lombok. Nun muss man natürlich wissen, welche Klassen man überhaupt verwenden kann und wie diese in Verbindung stehen. Ohne JavaDoc hätte man nun 2 verschiedene Webseiten, die komplett anders in ihrer Struktur aufgebaut sind. Durch JavaDoc sehen diese beiden Webseiten allerdings visiuel erstmal geleich aus und sind auch gleich aufgebaut [Spring Boot](https://docs.spring.io/spring-framework/docs/current/javadoc-api/), [Lombok](https://projectlombok.org/api/). <br/>
Ein weiterer Vorteil von JavaDoc ist, dass Informationen automatisch aus dem Sorucecode gelesen werden können. So muss man z.B. nicht mehr angeben, welche Klasse an welche Klasse vererbt oder auch was der Returnwert einer Methode ist. Das sind nämlich alles Informationen, welche bereits im Sourcecode vorhanden sind. <br/>
Zudem kann JavaDoc auch im IDE's automatisch ohne grössere Probleme ausgelesen werden. Dadurch muss man nicht auf die Dokumentation auf einer Webseite gehen, um herauszufinden, welche Parameter eine Methode erfordert. <br/>
Das Prinzip von automatisch generierten Dokumentationen hat nicht nur Java erfolgreich implementiert. Auch Swagger ist ein sehr beliebtes Tool, um einfach und ohne grösseren AUfwand eine REST API zu dokumentieren.

## C1F Javadoc mit Hilfe von einfachen Kommentaren erstellen <br/>
Ein Javadoc Kommentar ist ein Kommentar, der immer direckt über einer Klasse, Methode oder auch Konstruktor steht und mit `/**` beginnt. Der JavaDoc Kommentar kann man schnell mal mit einem normalen mehrzeiligen Kommentar verwechseln. ALlerdings besteht der Unterschied darin, dass der JavaDoc Kommentar mit 2 Sternen anfängt (`/*` = Normaler mehrzeiliger Kommentar **/** `/**` = Javadoc kommentar). In dem JavaDoc Kommentar kann man anschliessend eine kurze Beschreibung zu der Methode oder auch Klasse machen. Um bestimmte Bereiche in der Beschreibung hervorzuheben kann man auch `HTML`  Tags verwenden. <br/>
Ich habe das Ganze auch anhand eines [Beispiel-Projektes](./../07.09.2022/resources/javdoc/dev/bbzbl/m320/package-summary.html) umgesetzt. Dazu habe ich über alle Klassen, Methoden und Constructoren einen Javadoc Kommentar geschrieben.
```java
/**
 * 
 * Class which contains the logic of a ship.
 * 
 */
public class Ship {
}
```
Nun konnte ich in Eclipse über `Project` > `Generate Java Doc` die Javadoc für das Projekt generieren. Diese musste ich dann nur noch auf einen Webserver laden und fertig war die [Documentation](./../07.09.2022/resources/javdoc/dev/bbzbl/m320/package-summary.html) . 
