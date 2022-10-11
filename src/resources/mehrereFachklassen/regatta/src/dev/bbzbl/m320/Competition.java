package dev.bbzbl.m320;

import java.util.ArrayList;
import java.util.List;

public class Competition {
	private String name;
	private List<Ship> ships = new ArrayList<>();
	
	public Competition(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addShip(Ship ship) {
		if(ships.size() > 5) {
			System.err.println("Can't add a new Ship");
		}	
		this.ships.add(ship);
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
