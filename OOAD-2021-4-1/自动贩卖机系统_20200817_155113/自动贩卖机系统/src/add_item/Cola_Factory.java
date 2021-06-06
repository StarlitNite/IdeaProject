package add_item;

public class Cola_Factory implements Item_Factory{
	public Item produceDrink()
	{
		System.out.println("生产了可乐");
		return new Cola_add();
	}
}
