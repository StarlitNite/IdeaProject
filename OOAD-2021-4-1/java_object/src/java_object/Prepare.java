package java_object;

public class Prepare implements State{
	Drink drink;
	public Prepare(Drink drink) {
		// TODO Auto-generated constructor stub
		this.drink=drink;
	}
	@Override
	public void state(Drink drink) {
		// TODO Auto-generated method stub
		if(drink.statement==1) {
			System.out.println("Statement:"+drink.information()+" is preparing");
		}else {
			new WellPrepared(drink).state(drink);
		}
	}

}
