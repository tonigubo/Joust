package edu.bellarmine.tg.Joust;

/**
 * This class tests our Knight object.
 * 
 * @author Rob Kelley
 * @version 1.1 Lab11 - Knight Project Fall 2018
 */

public class Application {

	public static void main(String[] args) {

		// create all of the objects for the program
		Knight k1 = new Knight(10, "Sir Lancelot");
		Knight k2 = new Knight(10, "Sir Roger");
		ListField lf = new ListField(k1, k2);

		// create the local variables for the program
		int games = 0; // variable for number of games played
		boolean noExperience = false;// variable to track if either of the knights runs out of experience
		do {
			games++;
			System.out.println(lf.joust());
			if (k1.getExperience() < 1 || k2.getExperience() < 1)
				noExperience = true;

		} while (games < 10 && !noExperience);

		// Show the final accumulated outcomes
		System.out.printf("%s finished with %d experience points.%n%s finished with %d experience points.",
				k1.getName(), k1.getExperience(), k2.getName(), k2.getExperience());
		System.out.printf("%n%d matches played", games);

	}// end main

}// end class
