package decorator;

public class Soy extends Condiment {

	public Soy(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+0.2;
	}

	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		return beverage.getDiscription()+" with Soy";
	}
 
}
 
