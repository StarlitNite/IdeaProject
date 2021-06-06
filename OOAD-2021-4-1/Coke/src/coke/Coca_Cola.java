package coke;
//可口可乐--具体产品类
public class Coca_Cola implements Coke {

	@Override
	public String produce() {
		String str = "可口可乐正在生产...";
		return str;
	}
}
