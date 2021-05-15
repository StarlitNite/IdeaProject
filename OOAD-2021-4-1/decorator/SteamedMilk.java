package decorator;

public class SteamedMilk extends Condiment {

	public SteamedMilk(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+0.1;
	}

	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		return beverage.getDiscription()+" with Steamed Milk";
	}
 
}
 
