package celuemoshi_huiyuanzhi;

public class PlatinumMember implements Member {
	private double discount;
	
	
	/**
	 * @param discount
	 */
	public PlatinumMember() {
		super();
		this.discount = 0.9;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public double discount() {
		// TODO Auto-generated method stub
		return this.getDiscount();
	}

}
