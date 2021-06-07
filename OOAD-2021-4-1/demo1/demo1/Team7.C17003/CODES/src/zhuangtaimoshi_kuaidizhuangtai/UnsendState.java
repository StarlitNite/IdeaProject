package zhuangtaimoshi_kuaidizhuangtai;

public class UnsendState implements State {
	private packagee packagee;

	/**
	 * @param packagee
	 */
	public UnsendState(packagee packagee) {
		this.packagee = packagee;
	}

	@Override
	public boolean modify() {
		// TODO Auto-generated method stub
		double dd = (double)(Math.random()*100);
		if(dd <= 50) {
			this.packagee.setCurrent(this.packagee.getIntransitState());
		}
		return true;
	}

	@Override
	public boolean cancle() {
		// TODO Auto-generated method stub
		double dd = (double)(Math.random()*100);
		if(dd <= 50) {
			this.packagee.setCurrent(this.packagee.getIntransitState());
		}
		return true;
	}

	@Override
	public boolean query() {
		// TODO Auto-generated method stub
		double dd = (double)(Math.random()*100);
		if(dd <= 50) {
			this.packagee.setCurrent(this.packagee.getIntransitState());
		}
		return false;
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
