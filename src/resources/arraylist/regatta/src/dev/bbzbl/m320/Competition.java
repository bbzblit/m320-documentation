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
