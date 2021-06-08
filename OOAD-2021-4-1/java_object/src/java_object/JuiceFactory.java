package java_object;


public class JuiceFactory implements Factory{

	@Override
	public Drink ProduceDrink() {
		// TODO Auto-generated method stub
		return new juice();
	}

}
