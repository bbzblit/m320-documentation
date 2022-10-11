package dev.bbzbl.m320;

import java.util.Random;

public class Ship {

	private int nummer;
	private String name;
	private int time;

	public int getNummer() {
		return this.nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTime() {
		return this.time;
	}

	public void race() {
		Random random = new Random();
		this.time = random.nextInt(300) + 300;
	}

	public Ship(int nummer, String name) {

		this.nummer = nummer;
		this.name = name;
	}

}