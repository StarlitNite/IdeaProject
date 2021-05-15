package decorator;

import java.util.Scanner;

public class SellingSystem {
	private String[] beveMenu={"House Blend",
								"Dark Roast",
								"Decaf",
								"Espresso"};
	private String[] condMenu={"Steamed Milk",
								"Mocha",
								"Soy",
								"Whip"};
	private int showMenu(String[] menu) {
		int choice = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("==============");
		for(int i=0;i<menu.length;i++) {
			System.out.println("=="+i+"=="+menu[i]);
		}
		System.out.print("Please input your choice[0~"+menu.length+"]:");
		choice = s.nextInt();
		System.out.println("==============");
		return choice;
	}
	private Beverage getBeverage(int choice) {
		switch(choice) {
		case 0:return new HouseBlend();
		case 1:return new DarkRoast();
		case 2:return new Decaf();
		case 3:return new Espresso();
		default:return null;
		}
	}
	
	private Beverage getBeverage(int choice,Beverage beverage) {
		switch(choice) {
		case 0:return new SteamedMilk(beverage);
		case 1:return new Mocha(beverage);
		case 2:return new Soy(beverage);
		case 3:return new Whip(beverage);
		default:return null;
		}
	}
	
	private boolean isOver() {
		Scanner s = new Scanner(System.in);
		System.out.println("Do you still want to add more condiments?[Yes(1):No(0)]");
		return (s.nextInt() == 0 ? true:false);
	}
	public void run() {
		Beverage beverage = null;
		
		beverage = getBeverage(showMenu(beveMenu));		
		
		while(!isOver()) {
			beverage = getBeverage(showMenu(condMenu),beverage);			
		}
		
		System.out.println("You should pay $"+beverage.cost());
		System.out.println("You will get a cup of "+beverage.getDiscription());
		
	}

}
