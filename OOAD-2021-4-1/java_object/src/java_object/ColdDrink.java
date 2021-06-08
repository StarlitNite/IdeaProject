package java_object;

public class ColdDrink implements Modle{
	Drink drink;
	public ColdDrink(Drink drink){
		this.drink=drink;
	}

	public void cut() {
		System.out.println("cut "+drink.information());
	}
	
	@Override
	public void filter() {
		// TODO Auto-generated method stub
		System.out.println("filter "+drink.information());
	}

	
	@Override
	public void Temperature_treatment() {
		// TODO Auto-generated method stub
		System.out.println("freeze "+drink.information());
		drink.statement=2;
	}
	
	@Override
	public void disinfect() {
		// TODO Auto-generated method stub
		
	}

}