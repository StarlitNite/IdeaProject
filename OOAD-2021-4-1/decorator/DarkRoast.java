package decorator;

public class DarkRoast implements Beverage {
 
	/**
	 * @see decorator.Beverage#cost()
	 */
	public double cost() {
		return 0.99;
	}
	 
	/**
	 * @see decorator.Beverage#getDiscription()
	 */
	public String getDiscription() {
		return "Dark Roast";
	}
	 
}
 
