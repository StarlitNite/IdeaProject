package celuemoshi_huiyuanzhi;

public class DiamondMember implements Member {
	private double discount;
	
	
	/**
	 * @param discount
	 */
	public DiamondMember() {
		super();
		this.discount = 0.8;
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
