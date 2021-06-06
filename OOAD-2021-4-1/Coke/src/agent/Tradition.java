package agent;
//通过传统运输方式发货
public class Tradition implements DeliverGoods {
	boolean flag;
	String m = null;
	
	public Tradition(boolean flag) {
		this.flag = flag;
	}
	
	@Override
	public String sendCoke(String method) {
		if(flag == false){
			m = method;
		}
		return "您的订单已生成，请持订单到线下各大"+m+"，谢谢！";
	}

	@Override
	public String selectMethod() {
		return null;
	}
}
