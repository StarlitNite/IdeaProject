package add_meat;
public class Admin
{
	private MealBuilder mb;
	public void setMealBuilder(MealBuilder mb)
	{
		this.mb=mb;
	}
	public Meal construct()
	{
		mb.buildNoodles();
		mb.buildPrice();
		mb.buildMeat();
		mb.buildDrink();
		return mb.getMeal();
	}
}