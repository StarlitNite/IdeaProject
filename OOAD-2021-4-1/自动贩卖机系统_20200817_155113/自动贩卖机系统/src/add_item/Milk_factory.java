package add_item;

public class Milk_factory implements Item_Factory{
	public Item produceDrink()
	{
		System.out.println("生产了牛奶");
		return new Milk_add();
	}
}
