package java_object;

public class Coffee extends Drink{
	
	public Coffee() {
		// TODO Auto-generated constructor stub
		super.statement=0;
	}
	
	@Override
	public String information() {
		// TODO Auto-generated method stub
		return "Coffee";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 4.2;
	}

}
