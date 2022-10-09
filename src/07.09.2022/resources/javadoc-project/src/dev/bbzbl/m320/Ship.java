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
