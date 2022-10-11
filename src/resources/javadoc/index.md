[Back to main Page](./../../../README.md)

# Javadoc
Bei Resources handelt es sich um einen Folder. Aus diesem Gründen ist er nicht von GithubPages aus erreichbar. Um das ganze Projekt zu sehen muss es auf Github geöffnet werden.

<br/><br/>

In dieser Woche habe das Projekt aus der vorherigen Woche dokumentiert. Als endrpodukt davon habe ich nun eine funktionierende [Javadoc](./javdoc/index.html) 

 ## Wichtigste Klassen
 

### Main 

```java
package dev.bbzbl.m320;

/**
 * Main class to start a new competiton
 * @author yannick
 * @version 1.0
 *
 */
public class Main{
    
	/**
	 * Main method of the program
	 * @param args the command line args
	 */
	public static void main(String[] args){
        System.out.println("Hello World");
    }
}
```

### Competition
```java

package dev.bbzbl.m320;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Class which contains all Methods for a regatta
 * 
 * @version 1.0
 * @author yannick
 *
 */
public class Competition {

	private String name;
	private Ship[] ships = new Ship[5];
	
	/**
	 * Constructor for a new Competition
	 * 
	 * @param name the name of the competition
	 */
	public Competition(String name) {
		this.name = name;
		List<String> list = new ArrayList();
	}

	/**
	 * Start the ship Race
	 * 
	 * @see Ship#race()
	 */
	public void start() {

		for (Ship s : this.ships) {
			if (s != null) {
				s.race();
			}
		}
	}

	/**
	 * Add a new ship to the race.
	 * 
	 * @param ship the ship which should be added
	 */
	public void addShip(Ship ship) {
		for (int i = 0; i < ships.length; i++) {
			if (ships[i] == null) {
				ships[i] = ship;
				break;
			}
		}
	}
	
	/**
	 * Prints out the result of the competition
	 */
	public void printResult() {
		System.out.println("Wettkampf: " + this.name);

		for (Ship s : this.ships) {
			if (s != null) {
				System.out.println("Schiff Nr: " + s.getNr() 
				+ " Name: " + s.getName() + " Zeit: " + s.getTime());
			}
		}
	}
}

```

### Ship

```java
package dev.bbzbl.m320;

/**
 * 
 * Class which contains the logic of a ship.
 * 
 * @version 1.0
 * @author yannick
 *
 */
public class Ship {

	private int nr;
	private String name;
	private int time;

	/**
	 * 
	 * Constructor to create a new Ship
	 * 
	 * @param nr the ship number
	 * @param name the name of the ship
	 */
	public Ship(int nr, String name) {
		this.nr = nr;
		this.name = name;
	}

	/**
	 * Getter for Number
	 * 
	 * @return the ship number
	 */
	public int getNr() {
		return nr;
	}

	/**
	 * Set the ship number
	 * @param nr the number of the ship
	 */
	public void setNr(int nr) {
		this.nr = nr;
	}

	/**
	 * 
	 * Getter Method for the ship name
	 * 
	 * @return the ship name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * Setter Method for the ship name
	 * 
	 * @param name the name of the ship
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Method to start a new race and to generate a new time
	 */
	public void race() {
		int min = 300;
		int max = 600;
		this.time = (int) (Math.random() * (max - min + 1)) + min;
	}
	
	/**
	 * Method to get the time
	 * @return the race time
	 */
	public int getTime() {
		return time;
	}
	
}

```
