package edu.bellarmine.tg.Joust;
import java.util.Random;
/**
 * Shared random number generator
 * @author tgubo
 *
 */
public class SharedRandom {

	public static final Random r = new Random(100);
	/**
	 * Generate random number
	 * @param experience
	 * @return
	 */
	public static int getRandom(int experience) {
		return (r.nextInt(experience) + 1);
	}

}// end class
