package agent;

import message.Message;

//单例模式---代理商
public class Agent {
	private Message message;
	private Agent(){}
	private static class SingletonInstance{//静态内部类
		private static final Agent INSTANCE = new Agent();
	}
	
	public static Agent getInstance(){
		return SingletonInstance.INSTANCE;
	}
	public String call(){
		return "代理商";
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	
	
}
