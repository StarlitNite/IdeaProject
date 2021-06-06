package customer;
//订单具体建造者---建造者模式
public class OrderBuidler {
	private String name;//顾客姓名
	private String goods;//购买的商品
	private String address;//地址
	
	public OrderBuidler(String name,String goods,String address){
		this.name = name;
		this.goods = goods;
		this.address = address;
	}
	
	//生成订单方法
	public Order create(){
		return new Order(this);
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
