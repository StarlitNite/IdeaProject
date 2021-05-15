package decorator;

public class Espresso implements Beverage {
 
	/**
	 * @see decorator.Beverage#cost()
	 */
	public double cost() {
		return 1.99;
	}
	 
	/**
	 * @see decorator.Beverage#getDiscription()
	 */
	public String getDiscription() {
		return "Espresso";
	}
	 
}
 
