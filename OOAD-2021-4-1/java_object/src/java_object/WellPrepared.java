package java_object;

public class WellPrepared implements State{
	Drink drink;
	public WellPrepared(Drink drink) {
		// TODO Auto-generated constructor stub
		this.drink=drink;
	}
	@Override
	public void state(Drink drink) {
		// TODO Auto-generated method stub
		System.out.println("Statement:"+drink.information()+" is Well prepared");
		
	}

}
