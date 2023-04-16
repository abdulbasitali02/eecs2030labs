package labTest2;
/**
 * @author 2030 student [Abdulbasit Ali 218631838]
 *
 * The class should implement a product that could be sold in a store
 * The class is intended to be used in the implementation of another class or classes
 * 
 * ONE public constructor should exist:
 * Product(String name, double price): creates a product with the specified name and price
 * (you may add other - non-public - constructors, if you desire) 
 * 
 * in addition to the above, the following public methods should be implemented:
 * public String getName()
 * public double getPrice()
 * public void setPrice(double price)
 * 
 * String toString()
 * this one should return a String in the form of "name, price=X" where X is the item price, with two decimal digits (no quotation marks)
 * 
 * IMPORTANT
 * You are expected to use the best practices you learned in EECS 2030 so far.
 * you may import any standard library classes, as necessary
 * e.g., import java.util.List;
 *  
 */

public class Product {
	protected String name;
	protected double price;
	
	public Product(String name, double price) {
		this.price = price;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product: " + this.name + "\nPrice: " + this.price;	
	}
	
}


