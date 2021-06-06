package buy_order;

public class Order_No {
	private static Order_No instance = null;
	private String no;
	private Order_No() 
	{
		
	}

	public static Order_No getInstance() {
		if (instance == null) {
			System.out.println("获得新订单号");
			instance = new Order_No();
			instance.setOrder_No("1");
		}
		else {
			System.out.println("重复下单且与上一个未交易的订单相同，获取旧订单号");
		}
		return instance;
	}

	private void setOrder_No(String no) {
		this.no = no;
	}

	public String getOrder_No() {
		return this.no;
	}

}