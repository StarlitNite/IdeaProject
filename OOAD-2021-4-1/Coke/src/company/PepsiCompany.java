package company;
//单例模式--百事可乐总公司
public class PepsiCompany {
	private PepsiCompany(){}
	private static class SingletonInstance{//静态内部类
		private static final PepsiCompany INSTANCE = new PepsiCompany();
	}
	
	public static PepsiCompany getInstance(){
		return SingletonInstance.INSTANCE;
	}
	public String call(){
		return "百事可乐公司";
	}
}
