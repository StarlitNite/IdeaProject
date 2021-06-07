package zhuangshizhemoshi_dingdan;

public class DeliveryForm extends Form {
	private String xingxi;
	
	
	public String getXingxi() {
		return xingxi;
	}


	public void setXingxi(String xingxi) {
		this.xingxi = xingxi;
	}


	@Override
	public void fill() {
		// TODO Auto-generated method stub
		this.setXingxi("");
	}

}
