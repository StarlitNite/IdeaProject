package zhuangshizhemoshi_dingdan;

public class Transport extends FillDecorator {
	private Form form;
	private String transport;
	/**
	 * @param form
	 */
	public Transport(Form form,String transport) {
		super();
		this.form = form;
		this.transport = transport;
	}

	@Override
	public void fill() {
		// TODO Auto-generated method stub
		this.form.fill();
		String oldXingxi = this.getXingxi();
		this.setXingxi(oldXingxi+"<br/>‘À ‰∑Ω Ω£∫"+this.transport);
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
