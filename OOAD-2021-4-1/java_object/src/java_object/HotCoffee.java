package java_object;

public class HotCoffee implements Modle{
	Drink drink;
	public HotCoffee(Drink drink){
		this.drink=drink;
	}

	@Override
	public void Temperature_treatment() {
		// TODO Auto-generated method stub
		System.out.println("boil "+drink.information());
	}

	@Override
	public void filter() {
		// TODO Auto-generated method stub
		System.out.println("filter "+drink.information());
	}

	@Override
	public void disinfect() {
		// TODO Auto-generated method stub
		System.out.println("disinfect "+drink.information());
		drink.statement=2;
	}

}
