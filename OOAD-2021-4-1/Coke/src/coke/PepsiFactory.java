package coke;
//百事可乐具体工厂类
public class PepsiFactory implements CokeFactory{

	@Override
	public Coke produceCoke() {
		return new Pepsi();
	}
}
