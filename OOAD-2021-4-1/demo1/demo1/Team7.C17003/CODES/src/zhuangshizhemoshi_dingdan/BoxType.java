package zhuangshizhemoshi_dingdan;

public class BoxType extends FillDecorator {
	private Form form;
	private String boxType;
	/**
	 * @param form
	 */
	public BoxType(Form form,String boxType) {
		super();
		this.form = form;
		this.boxType = boxType;
	}

	@Override
	public void fill() {
		// TODO Auto-generated method stub
		this.form.fill();
		String oldXingxi = this.getXingxi();
		this.setXingxi(oldXingxi+"<br/>Ïä×ÓÐÍºÅ£º"+this.boxType);
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
