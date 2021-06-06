package coke;
//可口可乐具体工厂类
public class Coca_ColaFactory implements CokeFactory{

	@Override
	public Coke produceCoke() {
		return new Coca_Cola();
	}
}
