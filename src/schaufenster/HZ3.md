[Back to main Page](./../../README.md)

# Schaufenster HZ3

## C1G Verwendungszweck von JavaDoc <br/>
Java Doc ist eine Möglichkeit um einfach Sourcecode in Java zu dokumentieren. Dabei wird die Dokumentation direckt im Editor geschrieben. Das spart nicht nur Zeit und Resourcen, sondern ist auch für den Leser der documentation viel angenehmer. In grösseren Projekten verwendet man gerne mal mehrere externe librarys wie z.B. `Spring Boot` und `Lombok` nun muss man natürlich wissen welche Classen man überhaupt verwenden kann und wie diese in Verbindung stehen. Ohne javdoc hätte man nun 2 verschiedene Website, die komplet anderst in ihrer Strucktur aufgebaut sind. Durch javadoc sehen diese beiden Websiten allerdings visiuel erstmal gelich aus und sind auch gleich aufgebaut [Spring Boot](https://docs.spring.io/spring-framework/docs/current/javadoc-api/), [Lombok](https://projectlombok.org/api/). <br/>
Ein weiterer Vorteil von Java Doc ist, dass imformationen automatisch aus dem Sorucecode gelesen werden können. So muss man z.B. nicht mehr angeben, welche Klasse welche Klasse vererbt oder auch was der returnwert eine Methode ist. Das sind nämlich alles Informationen, welche bereits im Sourcecode vorhanden sind. <br/>
Zudem kann Javadoc auch im IDE's automatisch ohne grössere Probleme ausgelsen werden. Dadurch muss man nicht auf die Documentation auf einer Website gehen, um herauszufinden, welche Parameter eine Methode erfordert. <br/>
Das Prinzip von automatisch generierten Documentation hat nichtnur Java erfolgreich implementiert. Auch Swagger ist ein sehr beliebtes Tool, um einfach und ohne grösseren AUfwand eine REST API zu documentieren.

## C1F Javadoc mithilfe von einfachen Kommentarn erstellen <br/>
Ein Javadoc Kommentar ist ein commentar, der immer direckt über einer Klasse, Methode oder auch Konstruktor steht und mit `/**` beginnt. Der Javadoc Kommentar kann man schnell mal mit einem normalen mehrzeiligen kommentar verwechseln. ALlerdings besteht der Unterschied darin, dass der Javadoc Kommentar mit 2 Sterhen anfängt (`/*` = Normaler mehrzeiliger Kommentar **/** `/**` = Javadoc kommentar). In dem Javadoc Kommentar kann man anschlissend eine kurze Beschreibung zu der Methode oder auch Klasse machen. Um bestimmt Bereiche in der Beschreibung herforzuheben kann man auch `HTML`  Tags verwenden. <br/>
Ich habe das ganze auch einam beispielhaft anhand eines beispiel [Projektes](./../07.09.2022/resources/javdoc/dev/bbzbl/m320/package-summary.html) umgesetzt. Dazu habe ich über alle Cassen Methoden und Constructoren einen Javadoc Kommentar geschrieben.
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
