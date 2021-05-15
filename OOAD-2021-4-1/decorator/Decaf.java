package decorator;

public class Decaf implements Beverage {
 
	/**
	 * @see decorator.Beverage#cost()
	 */
	public double cost() {
		return 1.05;
	}
	 
	/**
	 * @see decorator.Beverage#getDiscription()
	 */
	public String getDiscription() {
		return "Decaf";
	}
	 
}
 
