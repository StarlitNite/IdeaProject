package java_object;

public class tea  extends Decoratro{

	public tea(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String information() {
		// TODO Auto-generated method stub
		return super.information()+" tea";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return super.price()+3.6;
	}

}
