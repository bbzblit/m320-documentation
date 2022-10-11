package dev.bbzbl.m320;

import dev.bbzbl.m320.generator.UMLGenerator;

public class Main {

	public static void main(String... args) {
		Competition c = new Competition("Rotsee Regatta");
		Ship ship1 = new Ship(1, "Alinghi");
		Ship ship2 = new Ship(2, "Red Baron");
		Ship ship3 = new Ship(3, "Blue Lagoon");
		c.addShip(ship1); //add ships to competition
		c.addShip(ship2);
		c.addShip(ship3);
		c.start(); //start competition
		c.printResult(); //print ships with time

		System.out.println("\n\nGenerated UML:");
		UMLGenerator umlGenerator = new UMLGenerator();
		System.out.println(umlGenerator.generateUmlByPackage(Main.class.getPackageName()));
	}


	
}
