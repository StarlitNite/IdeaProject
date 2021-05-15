package observer.v2;

public class FutureDisplay implements Display {

	public void display(double t, double h, double p) {
		System.out.println("-----------$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("-----------ÎÂ¶È£º"+t+"  Êª¶È£º"+h+"  Ñ¹Á¦£º"+p);
		System.out.println("-----------$$$$$$$$$$$$$$$$$$$$$$$$");
	}
 
	public void update(double t, double h, double p) {
		display(t,h,p);
	}

}
