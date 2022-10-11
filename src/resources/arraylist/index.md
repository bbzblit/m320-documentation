[Back to main Page](./../../../README.md)

# ArrayList
Bei Resources handelt es sich um einen Folder. Aus diesem Gründen ist er nicht von GithubPages aus erreichbar. Um das ganze Projekt zu sehen muss es auf Github geöffnet werden.


## Umsetzung
Ich habe schon von Anfang an einen ArrayList verwendet darum habe ich nochmals ohne implementiert

```java

package dev.bbzbl.m320;

import java.util.ArrayList;
import java.util.List;

public class Competition {
	private String name;
	private Ship[] ships = new Ship[0];
	
	public Competition(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addShip(Ship ship) {
		for(int i = 0; i < ships.length; i++) {
			if(this.ships[i] == null) {
				this.ships[i] = ship;
				return;
			}
		}
	}
	
	public void start() {
		for(Ship ship : this.ships) {
			ship.race();
		}
	}
	public void printResult() {
		for(Ship ship : this.ships) {
			System.out.println(String.format("Number: %s Name: %s Time: %s", ship.getNummer(), ship.getName(), ship.getTime()));
		}
	}
}

```