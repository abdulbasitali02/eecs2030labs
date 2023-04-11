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
		
		double remainder = amount % 0.05;
		if (amount < 0) {
			throw new IllegalArgumentException("Amount cannot be negative");
		}
		else if (amount > 1000) {
			throw new IllegalArgumentException("Amount cannot be greater than 1000");
		}
		else if (amount % 0.05 >= 0.025) {
			amount += (0.05 - remainder);
		}
		else if (amount % 0.05 < 0.025) {
			amount -= remainder;
		}
		else {
			List <CAD> list = new ArrayList<>();

			while(amount >= 100) {
				list.add(CAD.HUNDRED);
				amount -= 100;
			}
			while(amount >= 50) {
				list.add(CAD.FIFTY);
				amount -= 50;
			}
			while(amount >= 20) {
				list.add(CAD.TWENTY);
				amount -= 20;
			}
			while(amount >= 10) {
				list.add(CAD.TEN);
				amount -= 10;
			}
			while(amount >= 5) {
				list.add(CAD.FIVE);
				amount -= 5;
			}
			while(amount >= 2) {
				list.add(CAD.TWOONIE);
				amount -= 2;
			}
			while(amount >= 1) {
				list.add(CAD.LOONIE);
				amount -= 1;
			}
			while(amount >= 0.25) {
				list.add(CAD.QUARTER);
				amount -= 0.25;
			}
			while(amount >= 0.1) {
				list.add(CAD.DIME);
				amount -= 0.1;
			}
			while(amount >= 0.05) {
				list.add(CAD.NICKEL);
				amount -= 0.05;
			}
			return list;
		}
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
		
		String string = new String();
		double amt = amount;
		double remainder = amount % 0.05;
		if(amount % 0.05 > 0.025){
			amount = amount + 0.05 - remainder;
		}
		else if(amount % 0.05 < 0.025){
			amount = amount - remainder;
		}
		if(amount < 0){
			throw new IllegalArgumentException();
		}
		else {
			while(amount > 0){
			if(amount/100 > 1){
				if(Math.floor(amount/100)>=2){
				string += (int)Math.floor(amount/100) + " hundreds\n";
				}
				else
				{string += (int)Math.floor(amount/100) + " hundred\n";}
				amount = amount - 100*(int)Math.floor(amount/100);
			}
			else if(amount / 50 > 1){
				if(Math.floor(amount/50)>=2){
					string += (int)Math.floor(amount/50) + " fifties\n";
					}
					else
					{string += (int)Math.floor(amount/100) + " fifty\n";}
					amount = amount - 50*(int)Math.floor(amount/50);
			}
			else if(amount / 20 > 1){
				if(Math.floor(amount/20)>=2){
					string += (int)Math.floor(amount/20) + " twenties\n";
					}
					else
					{string += (int)Math.floor(amount/20) + " twenty\n";}
					amount = amount - 20*(int)Math.floor(amount/20);
			}
			else if(amount / 10 > 1){
				if(Math.floor(amount/10)>=2){
					string += (int)Math.floor(amount/10) + " tens\n";
					}
					else
					{string += (int)Math.floor(amount/10) + " ten\n";}
					amount = amount - 10*(int)Math.floor(amount/10);
			}
			else if(amount / 5 > 1){
				if(Math.floor(amount/5)>=2){
					string += (int)Math.floor(amount/5) + " fives\n";
					}
					else
					{string += (int)Math.floor(amount/5) + " five\n";}
					amount = amount - 5*(int)Math.floor(amount/5);
			}
			else if(amount / 2 > 1){
				if(Math.floor(amount/2)>=2){
					string += (int)Math.floor(amount/2) + " toonies\n";
					}
					else
					{string += (int)Math.floor(amount/2) + " toonie\n";}
					amount = amount - 2*(int)Math.floor(amount/2);
			}
			else if(amount / 1 > 1){
				if(Math.floor(amount/1)>=2){
					string += (int)Math.floor(amount/1) + " loonies\n";
					}
					else
					{string += (int)Math.floor(amount/1) + " loonie\n";}
					amount = amount - 1*(int)Math.floor(amount/1);
			}
			else if(amount / 0.25 > 1){
				if(Math.floor(amount/0.25)>=2){
					string += (int)Math.floor(amount/0.25) + " quarters\n";
					}
					else
					{string += (int)Math.floor(amount/0.25) + " quarter\n";}
					amount = amount - 0.25*(int)Math.floor(amount/0.25);
			}
			else if(amount / 0.10 > 1){
				if(Math.floor(amount/0.10)>=2){
					string += (int)Math.floor(amount/0.10) + " dimes\n";
					}
					else
					{string += (int)Math.floor(amount/0.10) + " dime\n";}
					amount = amount - 0.10*(int)Math.floor(amount/0.10);
			}
			else if(amount / 0.05 > 1){
				if(Math.floor(amount/0.05)>=2){
					string += (int)Math.floor(amount/0.05) + " nickels\n";
					}
					else
					{string += (int)Math.floor(amount/0.05) + " nickel\n";}
					amount = amount - 0.05*(int)Math.floor(amount/0.05);
			}
			else if(amount < 0.05){
				amount = 0;
			}
			
			}
		}
		return amt + " =\n" + string;
	}
}