package decorator;

public class HouseBlend implements Beverage {
 
	/**
	 * @see decorator.Beverage#cost()
	 */
	public double cost() {
		return 0.89;
	}
	 
	/**
	 * @see decorator.Beverage#getDiscription()
	 */
	public String getDiscription() {
		return "House Blend";
	}
	 
}
 
