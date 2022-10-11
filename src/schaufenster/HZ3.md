[Back to main Page](./../../README.md)

# Schaufenster HZ2

## C1G Verwendungszweck von JavaDoc <br/>
Java Doc ist eine Möglichkeit, um Sourcecode in Java zu dokumentieren. Dabei wird die Dokumentation direkt im Editor geschrieben. Das spart nicht nur Zeit und Ressourcen, sondern ist auch für den Leser der Dokumentation viel angenehmer. In grösseren Projekten verwendet man gerne mal mehrere externe Librarys wie z.B. `Spring Boot` und `Lombok. Nun muss man natürlich wissen, welche Klassen man überhaupt verwenden kann und wie diese in Verbindung stehen. Ohne JavaDoc hätte man nun 2 verschiedene Webseiten, die komplett anders in ihrer Struktur aufgebaut sind. Durch JavaDoc sehen diese beiden Webseiten allerdings visuell erstmal gleich aus und sind auch gleich aufgebaut [Spring Boot](https://docs.spring.io/spring-framework/docs/current/javadoc-api/), [Lombok](https://projectlombok.org/api/). <br/>
Ein weiterer Vorteil von JavaDoc ist, dass Informationen automatisch aus dem Sorucecode gelesen werden können. So muss man z.B. nicht mehr angeben, welche Klasse an welche Klasse vererbt oder auch was der Returnwert einer Methode ist. Das sind nämlich alles Informationen, welche bereits im Sourcecode vorhanden sind. <br/>
Zudem kann JavaDoc auch in den IDEs automatisch ohne grössere Probleme ausgelesen werden. Dadurch muss man nicht auf die Dokumentation auf einer Webseite gehen, um herauszufinden, welche Parameter eine Methode erfordert. <br/>
Das Prinzip von automatisch generierten Dokumentationen hat nicht nur Java erfolgreich implementiert. Auch Swagger ist ein sehr beliebtes Tool, um einfach und ohne grösseren AUfwand eine REST API zu dokumentieren.

## C1F Javadoc mit Hilfe von einfachen Kommentaren erstellen <br/>
Ein Javadoc Kommentar ist ein Kommentar, der immer direkt über einer Klasse, Methode oder auch Konstruktor steht und mit `/**` beginnt. Den JavaDoc Kommentar kann man schnell einmal mit einem normalen mehrzeiligen Kommentar verwechseln. Allerdings besteht der Unterschied darin, dass der JavaDoc Kommentar mit 2 Sternen anfängt (`/*` = Normaler mehrzeiliger Kommentar **/** `/**` = Javadoc Kommentar). Im JavaDoc Kommentar kann man anschliessend eine kurze Beschreibung zu der Methode oder auch Klasse machen. Um bestimmte Bereiche in der Beschreibung hervorzuheben, kann man auch `HTML`  Tags verwenden. <br/>
Ich habe das Ganze auch anhand eines [Beispiel-Projektes](./../07.09.2022/resources/javdoc/dev/bbzbl/m320/package-summary.html) umgesetzt. Dazu habe ich über alle Klassen, Methoden und Konstruktoren einen Javadoc Kommentar geschrieben.
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
## C1E Implementieren von JavaDoc anhand der wichtigsten Tags
Wenn man sich einmal die JavaDoc für die [`String`](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) Klasse etwas genauer anschaut, fällt einem schnell auf, dass gewisse Bereiche etwas hervorgehoben sind. Ein Beipiel dafür ist ein Berreich, in dem man Methoden und Klassen sieht, die etwas mit `String` zu tun haben (See Also). Natürlich könnte man das ganze mit HTML Tags formatieren. Das ganze wäre allerdings extrem aufwändig und auch redundante Arbeit. Aus diesem Grund gibt es in JavaDoc sogennante Tags, die sehr an Java Annotationen erinnern. Ein Tag beginnt immer mit einem `@` Zeichen, gefolgt von dem Tagname im Falle von Verweise wäre das z.B. `@see`. Alles was nachher an Text kommt, wird speziell in der JavaDoc angezeigt. Es gibt eine grosse Anzahl an JavaDoc Tags, die man auch nicht alle auswendig kennen muss. Allerdings hat es Vorteile, wenn man die Wichtigsten kennt.


| Tag | Usecase |
|---|---|
| `@see` | Verweist auf Methoden oder Klassen, die in Verbindung mit der Klasse stehen oder relevant sein könnten. <br/> Wichtig ist, dass man das ganze im Format `<package>.<Class>(#<Method>)` angibt, dass JavaDoc auch gleich einen Hyperlink zur anderen Klasse einfügen kann. |
| `@author` | Name des Authors, der die Klasse geschrieben hat. |
| `@since` | Spezifiziert die Version, seit wann die Klasse Implementiert ist |
| `@version` | Version der Klasse **NICHT** seit wann es implementiert ist |
| `@param` | Beschreibt, was für Parameter erwartet werden. Jeder Parameter hat sein eigene `@param` Annotation gefolgt von dem Namen und der Verwendung. |
| `@return` | Definiert, was eine Methode returnt |
| `@throws` | Definiert, unter welchen Umständen welche Fehler erwartet werden können. |

<br/>

### Inline Tags
In gewissen Fällen kann es auch sinnvoll sein, einen Tag in einem Text zu verwenden. So kann man es z.B. benutzen, um bestimmte Sachen genauer zu formatieren, oder um auf andere Methoden/Kassen zu verweisen. Ein `inline Tag` ist fast gleich aufgebaut wie ein normaler Tag. Der Unterschied besteht darin, dass er nicht für die ganze Linie gilt, sondern nur für den Bereich zwischen den `{}`. 
```java
/**
 * 
 * Class which contains the logic of a ship.
 * Needs a {@link dev.bbzblit.m320.Port} to start
 * @author Yanni8
 */
public class Ship {
}
```
### Wichtigste Inline Tags


| Tag | Usecase |
|---|---|
| `{@link }` | Funktionert gleich wie der `@see` Tag |
| `{@code }` | Formatiert den Block anders, um ihn hervorzuheben |

### Meine Umsetzung

Ich habe das ganze natürlich auch einmal anhand eines kleinen Testprojektes umgesetzt. Dazu habe ich die bereits bestehende [`Documentation`](./../07.09.2022/resources/index.md#wichtigste-klassen) mit den nötigen Tags versehen. 
