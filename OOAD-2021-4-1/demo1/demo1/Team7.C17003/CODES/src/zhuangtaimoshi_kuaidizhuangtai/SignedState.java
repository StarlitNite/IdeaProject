package zhuangtaimoshi_kuaidizhuangtai;

public class SignedState implements State {
	private packagee packagee;

	/**
	 * @param packagee
	 */
	public SignedState(packagee packagee) {
		this.packagee = packagee;
	}

	@Override
	public boolean modify() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cancle() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean query() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean evaluate() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	
}

