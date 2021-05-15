package decorator;

public abstract class Condiment implements Beverage {
 
	protected Beverage beverage;

	public Condiment(Beverage beverage) {
		super();
		this.beverage = beverage;
	}
	 
}
 
