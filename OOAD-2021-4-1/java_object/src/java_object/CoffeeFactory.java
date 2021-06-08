package java_object;

public class CoffeeFactory implements Factory{

	@Override
	public Drink ProduceDrink() {
		// TODO Auto-generated method stub
		return new Coffee();
	}

}
