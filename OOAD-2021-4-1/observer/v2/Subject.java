package observer.v2;

import java.util.ArrayList;

public class Subject {//该类仅仅负责维护【主题和观察者】之间的关系
	private ArrayList<Display> display = new ArrayList<Display>();//关联关系上移
	
	public void register(Display d) {//注册新的显示元素对象
		display.add(d);
	}
	
	public void updateAll(double t,double h,double p) {
		for(Display d:display) {
			d.update(t,h,p);
		}
	}
}
