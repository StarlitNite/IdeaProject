package decorator;

public class Mocha extends Condiment {
	public Mocha(Beverage berverage) {
		super(berverage);
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+0.2;
	}

	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		return beverage.getDiscription()+" with Mocha";
	}
}
 
