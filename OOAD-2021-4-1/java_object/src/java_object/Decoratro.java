package java_object;

public abstract class Decoratro extends Drink{
	public Drink drink;
	public Decoratro(Drink drink){
		this.drink=drink;
	}

	@Override
	public String information() {
		// TODO Auto-generated method stub
		return drink.information();
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return drink.price();
	}
	
}
