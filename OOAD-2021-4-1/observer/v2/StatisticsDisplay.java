package observer.v2;

public class StatisticsDisplay implements Display { 
	
	public void display(double t, double h, double p) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("ÎÂ¶È£º"+t);
		System.out.println("Êª¶È£º"+h);
		System.out.println("Ñ¹Á¦£º"+p);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
	}
 
	public void update(double t, double h, double p) {
		display(t,h,p);
	}
	 
}
 
