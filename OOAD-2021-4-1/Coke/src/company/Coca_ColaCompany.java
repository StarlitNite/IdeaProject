package company;
//单例模式---可口可乐总公司
public class Coca_ColaCompany {
	private Coca_ColaCompany(){}
	private static class SingletonInstance{//静态内部类
		private static final Coca_ColaCompany INSTANCE = new Coca_ColaCompany();
	}
	
	public static Coca_ColaCompany getInstance(){
		return SingletonInstance.INSTANCE;
	}
	public String call(){
		return "可口可乐公司";
	}
}
