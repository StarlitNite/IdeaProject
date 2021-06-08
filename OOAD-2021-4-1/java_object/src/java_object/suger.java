package java_object;

public class suger extends Decoratro{

	public suger(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
		super.statement=1;
	}
	
	@Override
	public String information() {
		// TODO Auto-generated method stub
		return super.drink.information()+" suger";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return super.drink.price()+3.0;
	}
}
