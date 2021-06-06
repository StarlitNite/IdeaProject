package add_meat;
public abstract class MealBuilder
{
	protected Meal meal=new Meal();
	public abstract void buildPrice();
	public abstract void buildNoodles();
	public abstract void buildDrink();
	public abstract void buildMeat();
	public Meal getMeal()
	{
		return meal;
	}
}