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
				System.out.println("Schiff Nr: " + s.getNr() + " Name: " + s.getName() + " Zeit: " + s.getTime());
			}
		}
	}
}
