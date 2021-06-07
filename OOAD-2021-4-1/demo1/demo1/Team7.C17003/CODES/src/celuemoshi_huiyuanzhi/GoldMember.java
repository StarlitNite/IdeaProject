package celuemoshi_huiyuanzhi;

public class GoldMember implements Member {
	private double discount;
	
	/**
	 * @param discount
	 */
	public GoldMember() {
		super();
		this.discount = 0.7;
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
