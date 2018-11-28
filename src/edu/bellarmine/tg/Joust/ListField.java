package edu.bellarmine.tg.Joust;
/**
 * This class models a ListField object on which knights joust.
 * 
 * @author Rob Kelley
 * @version 1.1 Lab11 - Knight Project Fall 2018
 */
public class ListField {

	/** Reference to first Knight object */
	private Knight knight1;
	/** Reference to second Knight object */
	private Knight knight2;

	/**
	 * Empty-Argument constructor that creates/initializes two Knight objects.
	 */
	public ListField() {
		knight1 = null;
		knight2 = null;
	}// end constructor

	/**
	 * This constructor builds a list field with two knights at creation time.
	 * 
	 * @param k1
	 * @param k2
	 */
	public ListField(Knight k1, Knight k2) {
		this.knight1 = k1;
		this.knight2 = k2;
	}// end constructor

	/**
	 * Method that adds two knights to the list field after the listfield object has
	 * been created.
	 * 
	 * @param k1
	 * @param k2
	 */
	public void addKnights(Knight k1, Knight k2) {
		this.knight1 = k1;
		this.knight2 = k2;
	}// end addKnights

	/**
	 * This method performs the actual joust. Each knight bets experience points,
	 * the points are compared, the knight who used the most experience points wins.
	 * 
	 * @return winner - output of the match
	 */
	public String joust() {

		int k1 = knight1.joust();
		int k2 = knight2.joust();
		String winner = knight1.getName() + " bet " + knight1.getBet() + " experience points.\n" + knight2.getName()
				+ " bet " + knight2.getBet() + " experience points.\n";

		if (k1 > k2) {
			knight1.increaseExperience();
			winner += knight1.getName() + " wins!";
		} else if (k1 < k2) {
			knight2.increaseExperience();
			winner += knight2.getName() + " wins!";
		} else {
			winner += "A tie, no one wins.";

		}
		return winner;
	}// end joust

}// end class
