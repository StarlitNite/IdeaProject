package java_object;

public class NoStatement implements State{
	
	private static NoStatement STATEMENT = new NoStatement();
	
	public static State getNoStatement() {
		return STATEMENT;
	}
	
	@Override
	public void state(Drink drink) {
		// TODO Auto-generated method stub
		if(drink.statement==0) {
			System.out.println("Statement:"+drink.information()+" is empty");
		}else {
			new Prepare(drink).state(drink);
		}
	}
}
