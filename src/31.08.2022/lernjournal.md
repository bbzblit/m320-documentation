[Back to main Page](./../../README.md)

# Lernjournal 31.08.2022

## Was habe ich gemacht?

- **Erstellen eines Games** <br/>
Aufgbe war es, ein Game zu erstellen bei dem mehrere Spieler antreten können. Diese verschiedenen Spieler kämpfen dann so lange gegeneinander, bis nur noch ein Spieler übrig ist. Jeder Spieler besitzt am Anfang einen Namen, ein HP Wert und einen AP-Wert. Der AP (Attack Point) Wert sagt aus, wie stark der Spieler ist (also, wie stark sein Angriff ist.). Aus diesem Grund habe ich die Klasse [`Character`](./resources/index.md#character) erstellt. Dabei handelt es sich nur um eine simple Modelklasse. Die einzige Spezialität ist, dass die `.setHP()` Methode so modifiziert ist, dass der HP Wert niemals unter 0 geraten kann. Ausserdem gibt es noch eine Methode `.death()` die angebt, ob der Kämpfer bereits gestorben ( HP = 0 ) ist oder nicht.<br/><br/>
**Weapon Klasse** <br/>
Natürlich braucht ein Kämpfer für einen Angriff auch eine Waffe. Aus diesem Grund habe ich die Klasse [`Weapon`](./resources/index.md#weapon) diese beinhaltet eine Attribut `Name` (Name der Waffe ) und ein Attribut `Damage` (Multiplikator für den Damage am gegener)<br/><br/>
**Fight**<br/>
Die ganze Logik für den Kampf ist in der Klasse [`Fight`](./resources/index.md#fight) dargestellt. Diese hat 2 Attribute. Zuerst ist da einmal eine Liste von allen Teilnehmer (`participan `). Ausserdem hat sie auch einem Attribut `weapons`, welche alle Waffen beinhaltet, die am Kampf zugelassen sind. Damit es immer genügend Waffen am Kampf gibt, werden defaultmässig beim Neuerstellen der Klasse 4 Waffen geladen. Natürlich können aber später auch weitere Waffen über die dafür vorgesehenen Setter Methoden hinzugefügt werden.
```java
	public Fight() {
		this.weapons.add(new Weapon("sword", 3));
		this.weapons.add(new Weapon("pistle", 4));
		this.weapons.add(new Weapon("kick", 1));
		this.weapons.add(new Weapon("AK-47", 5));
	}
```
Da einen Kampf mit weniger als 2 Teilnehmer keinen Sinn ergeben würde, beinhaltet die Klasse auch eine Methode `.ready()`. Diese returnt immer `true`, wenn sich mehr als 2 Kämpfer für den Kampf angemeldet haben. <br/>
Zuguterletzt ist da aber natürlich auch noch die `.fight()` Methode. Mit dieser kann der Kampf gestartet werden. Wenn diese Methode aufgerufen wird, werden 2 zufällige Kämpfer ausgewählt, die dann bis zum tot gegeneinander Kämpfen. Dies wiederholt sich dann so lange, bis nur noch 1 Kämpfer übrig ist.
- **OCA**
Da ich die meisten von den behandelten Themen bereits kenne, habe ich mich daran gemacht, in einem Buch über die Java OCA Zertifizierung zu lesen. Dabei handelt es sich um ein Buch, dass die ganzen Javagrundlagen beschreibt. Dabei habe ich sehr viele neue Sachen in Java dazugelernt. Zum Beispiel wusste ich nicht, dass Java einen Deconstructor hat. Dieser wird aufgerufen, kurz bevor der GarbageCleaner in Java das Objekt "zerstört". Der Deconstructor wird in Java allerdings nur ganz selten verwendet.
**Deconstructor in java:** 
```java
protected void finalize()  {
    System.out.println("Calling finalize");
}
```
Ausserdem wusste ich nicht, dass man in Java zur besseren Lesbarkeit numerische Werte auch mit Unterstrichen darstellen kann (Solange diese nicht am Anfang, Ende oder neben einem Komapunkt stehen).
```java
int number = 1000;
number = 1_0_0_0; //Will compile
number = 1__________0; //Will also compile
```
Ich habe auch noch einen weiteren guten Punkt über numerischen Werten gelernt. Ich wusste, dass man in Java hexadezimale Werte mit `0x` und binäre Werte mit `0b` darstellen kann. Mir war allerdings **nicht** Bewusst, dass es noch einen weiteren Wert gibt. In java kann man auch das oktale System darstellen, indem man eine `0` vor die Zahl schreibt. Meiner Meinung nach kann das sehr gut und schnell zu einem schwer findbaren Bug führen und ist deshalb gut zu wissen.
```java
System.out.println(56);       // 56
System.out.println(0b11);     // 3
System.out.println(017);      // 15 NOT 17
System.out.println(0x1F);     // 31
```
## Was ist mir heute klar geworden?
Ich habe sehr viele wichtige neue Informationen in Java dazugelernt, welche ich nicht wusste. 

## Ziele
Mein Ziel ist es, dass ich in der nächsten Woche mein Lernjournal im Laufe der Woche und nicht erst am Sontagabend schreibe.  
