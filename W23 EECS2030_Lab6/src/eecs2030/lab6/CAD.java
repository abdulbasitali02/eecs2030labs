package eecs2030.lab6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andriy
 * The enumeration implements the coins and bills of the Canadian currency, from 5 cents to 100 dollars.
 */
public enum CAD {

	/**
	 * @return the value of the coin or bill in dollars
	 */
	public double getValue() {
		return 0.0;
	}

	/**
	 * @param list list of bills and coin enumerations
	 * @return the total amount represented by the bills and coins in the list 
	 */
	public static double sum (List <CAD> list) {
		//TODO
		return 0.0;
	}

	/**
	 * @param amount amount in dollars, for which a list of bills and coins should be created. 
	 * @return list of bills and coins enums representing the amount, rounded to the nearest 5 cents. This list 
	 * should be the shortest possible for the given amount.
	 */
	public static List <CAD> countOut (double amount) {
		//TODO
		return null;
	}

	/**
	 * @param amount amount in dollars, for which a list of bills and coins should be generated in a form of a string. 
	 * @return a String listing the bills and coins that would represent the amount, rounded to the nearest 5 cents. 
	 * This list should be the shortest possible for the given amount.
	 * E.g., for a value of 31.53, the returned String object will be
	 * "31.53 =
	 * 1 twenty
	 * 1 ten
	 * 1 loonie
	 * 2 quarters
	 * 1 nickel"
	 * Note the newline characters.
	 */	
	public static String countOutString (double amount) {
		//TODO
		return null;
	}

}
