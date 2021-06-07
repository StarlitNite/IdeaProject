package zhuangshizhemoshi_dingdan;

public class BasicInpormation extends FillDecorator {
	private Form form;
	private String basicInpormation;
	/**
	 * @param form
	 */
	public BasicInpormation(Form form,String basicInpormation) {
		super();
		this.form = form;
		this.basicInpormation = basicInpormation;
	}

	@Override
	public void fill() {
		// TODO Auto-generated method stub
		this.form.fill();
		String oldXingxi = this.getXingxi();
		this.setXingxi(oldXingxi+"<br/>用户信息："+this.basicInpormation);
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
