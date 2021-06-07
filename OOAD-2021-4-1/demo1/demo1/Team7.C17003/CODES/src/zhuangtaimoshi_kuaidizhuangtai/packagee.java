package zhuangtaimoshi_kuaidizhuangtai;

public class packagee {
	private State UnsendState;
	private State IntransitState;
	private State SignedState;
	private State Current;
	/**
	 * @param unsendState
	 * @param intransitState
	 * @param signedState
	 * @param current
	 */
	public packagee() {
		this.UnsendState = new UnsendState(this);
		this.IntransitState = new IntransitState(this);
		this.SignedState = new SignedState(this);
		this.Current = new UnsendState(this);
	}
	
	
	public boolean modify() {
		return this.Current.modify();
	}

	public boolean cancle() {
		return this.Current.cancle();
	}

	public boolean query() {
		return this.Current.query();
	}

	public boolean evaluate() {
		return this.Current.evaluate();
	}
	
	
	
	
	
	public State getUnsendState() {
		return UnsendState;
	}
	public State getIntransitState() {
		return IntransitState;
	}
	public State getSignedState() {
		return SignedState;
	}
	public State getCurrent() {
		return Current;
	}
	public void setCurrent(State current) {
		Current = current;
	}
	
	
	
}
