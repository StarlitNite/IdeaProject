package add_meat;
public class Meat_B extends MealBuilder
{
	public void buildNoodles()
	{
		meal.setNoodles("老坛酸菜牛肉面*1");
	}
	public void buildDrink()
	{
	    meal.setDrink("可乐*1");
	}
	public void buildMeat()
	{
		meal.setMeat("无");
	}
	public void buildPrice()
	{
		meal.setPrice(7);
	}
}