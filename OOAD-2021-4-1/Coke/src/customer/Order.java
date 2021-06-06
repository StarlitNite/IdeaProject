package customer;
//订单类
public class Order {
	private String name;//顾客姓名
	private String goods;//购买的商品
	private String address;//地址
	
	public Order(OrderBuidler builder){
		this.name = builder.getName();
		this.goods = builder.getGoods();
		this.address = builder.getAddress();
	}
	
	//生成订单
	public void createOrder(){
		System.out.println("----订单已生成----");
		if(name != null){
			System.out.println("顾客姓名："+name);
		}
		System.out.println("购买的商品："+goods);
		System.out.println("地址"+address);
	}

	public String getName() {
		return name;
	}

	public String getGoods() {
		return goods;
	}

	public String getAddress() {
		return address;
	}
	
}
