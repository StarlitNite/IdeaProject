package decorator;

public class Test {

	public static void main(String[] args) {
		/*
		 * Beverage espresso = new Espresso(); espresso = new Mocha(espresso); espresso
		 * = new SteamedMilk(espresso); espresso = new Whip(new SteamedMilk(espresso));
		 * 
		 * System.out.println(espresso.cost());
		 * System.out.println(espresso.getDiscription());
		 */
		new SellingSystem().run();

	}

}
