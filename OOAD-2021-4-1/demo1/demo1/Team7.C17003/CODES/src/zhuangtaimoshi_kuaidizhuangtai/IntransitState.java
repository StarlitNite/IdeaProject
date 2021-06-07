package zhuangtaimoshi_kuaidizhuangtai;

public class IntransitState implements State {
	private packagee packagee;

	/**
	 * @param packagee
	 */
	public IntransitState(packagee packagee) {
		this.packagee = packagee;
	}

	@Override
	public boolean modify() {
		// TODO Auto-generated method stub
		double dd = (double)(Math.random()*100);
		if(dd <= 50) {
			this.packagee.setCurrent(this.packagee.getSignedState());
		}
		return false;
	}

	@Override
	public boolean cancle() {
		// TODO Auto-generated method stub
		double dd = (double)(Math.random()*100);
		if(dd <= 50) {
			this.packagee.setCurrent(this.packagee.getSignedState());
		}
		return false;
	}

	@Override
	public boolean query() {
		// TODO Auto-generated method stub
		double dd = (double)(Math.random()*100);
		if(dd <= 50) {
			this.packagee.setCurrent(this.packagee.getSignedState());
		}
		return true;
	}

	@Override
	public boolean evaluate() {
		// TODO Auto-generated method stub
		double dd = (double)(Math.random()*100);
		if(dd <= 50) {
			this.packagee.setCurrent(this.packagee.getIntransitState());
		}
		return false;
	}
	
	
	
}
