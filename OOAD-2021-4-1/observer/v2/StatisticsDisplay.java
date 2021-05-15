package observer.v2;

public class StatisticsDisplay implements Display { 
	
	public void display(double t, double h, double p) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("�¶ȣ�"+t);
		System.out.println("ʪ�ȣ�"+h);
		System.out.println("ѹ����"+p);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
	}
 
	public void update(double t, double h, double p) {
		display(t,h,p);
	}
	 
}
 
