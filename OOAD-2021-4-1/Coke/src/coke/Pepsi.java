package coke;
//百事可乐--具体产品类
public class Pepsi implements Coke {

	@Override
	public String produce() {
		String str = "百事可乐正在生产...";
		return str;
	}
}
