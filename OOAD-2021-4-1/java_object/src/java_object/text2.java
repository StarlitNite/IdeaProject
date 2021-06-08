package java_object;

public class text2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory coffeeactory = new CoffeeFactory();
		Drink product1 = coffeeactory.ProduceDrink();
		
		product1 = new suger(product1);
		System.out.println("name:"+product1.information()+" price:"+product1.price());
		
		HotCoffee deal_product1 = new HotCoffee(product1);
		deal_product1.Temperature_treatment();
		deal_product1.filter();
		deal_product1.disinfect();
		
		State CheckStatement = NoStatement.getNoStatement();
		CheckStatement.state(product1);
		
		System.out.println();//»»ÐÐ
		
		Factory juicefactory = new JuiceFactory();
		Drink product2 = juicefactory.ProduceDrink();
		
		product2= new tea(product2);
		product2= new suger(product2);
		System.out.println("name:"+product2.information()+" price:"+product2.price());
		
		ColdDrink deal_product2 = new ColdDrink(product2);
		deal_product2.cut();
		deal_product2.filter();
		
		CheckStatement.state(product2);
		
		
	}

}
