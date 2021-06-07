package zhuangshizhemoshi_dingdan;

public class Address extends FillDecorator {
	private Form form;
	private String address;
	/**
	 * @param form
	 */
	public Address(Form form,String address) {
		super();
		this.form = form;
		this.address = address;
	}

	@Override
	public void fill() {
		// TODO Auto-generated method stub
		this.form.fill();
		String oldXingxi = this.getXingxi();
		this.setXingxi(oldXingxi+"<br/>µÿ÷∑£∫"+this.address);
	}

	@Override
	public String getXingxi() {
		// TODO Auto-generated method stub
		return this.form.getXingxi();
	}

	@Override
	public void setXingxi(String xingxi) {
		// TODO Auto-generated method stub
		this.form.setXingxi(xingxi);
	}


}
