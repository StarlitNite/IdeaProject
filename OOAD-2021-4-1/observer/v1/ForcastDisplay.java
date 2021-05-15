package observer.v1;

public class ForcastDisplay {
	public void display(double t, double h, double p) {
		System.out.print("ÎÂ¶È£º"+t+"  Êª¶È£º"+h+"  Ñ¹Á¦£º"+p);
	}
	public void update(double t, double h, double p) {
		display(t,h,p);
	}
	 
}
 
