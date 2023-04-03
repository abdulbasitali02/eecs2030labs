package eecs2030.lab6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andriy
 * The enumeration implements the coins and bills of the Canadian currency, from 5 cents to 100 dollars.
 */
public enum CAD {
	NICKEL(0.05),
	DIME(0.10),
	QUARTER(0.25),
	LOONIE(1.00),
	TWOONIE(2.00),
	FIVE(5.00),
	TEN(10.00),
	TWENTY(20.00),
	FIFTY(50.00),
	HUNDRED(100.00);

	private double value;

	private CAD(double value) {
		this.value = value;
	}
	/**
	 * @return the value of the coin or bill in dollars
	 */
public double getValue() {
		return this.value;
	}

	/**
	 * @param list list of bills and coin enumerations
	 * @return the total amount represented by the bills and coins in the list 
	 */

	 // loop through list and create a sum of all the values
	public static double sum (List <CAD> list) {
		return list.stream().mapToDouble(CAD::getValue).sum();
	}

	/**
	 * @param amount amount in dollars, for which a list of bills and coins should be created. 
	 * @return list of bills and coins enums representing the amount, rounded to the nearest 5 cents. This list 
	 * should be the shortest possible for the given amount.
	 */
	public static List <CAD> countOut (double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Amount cannot be negative");
		}
		else if (amount > 1000) {
			throw new IllegalArgumentException("Amount cannot be greater than 1000");
		}
		else if (amount % 0.05 != 0) {
			throw new IllegalArgumentException("Amount must be rounded to the nearest 5 cents");
		}
		else {
			List <CAD> list = new ArrayList<>();
			while (amount > 0) {
				if (amount >= 100) {
					list.add(CAD.HUNDRED);
					amount -= 100;
				}
				else if (amount >= 50) {
					list.add(CAD.FIFTY);
					amount -= 50;
				}
				else if (amount >= 20) {
					list.add(CAD.TWENTY);
					amount -= 20;
				}
				else if (amount >= 10) {
					list.add(CAD.TEN);
					amount -= 10;
				}
				else if (amount >= 5) {
					list.add(CAD.FIVE);
					amount -= 5;
				}
				else if (amount >= 2) {
					list.add(CAD.TWOONIE);
					amount -= 2;
				}
				else if (amount >= 1) {
					list.add(CAD.LOONIE);
					amount -= 1;
				}
				else if (amount >= 0.25) {
					list.add(CAD.QUARTER);
					amount -= 0.25;
				}
				else if (amount >= 0.1) {
					list.add(CAD.DIME);
					amount -= 0.1;
				}
				else if (amount >= 0.05) {
					list.add(CAD.NICKEL);
					amount -= 0.05;
				}
			}
			return list;
		}
		
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
