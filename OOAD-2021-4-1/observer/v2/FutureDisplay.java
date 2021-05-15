package observer.v2;

public class FutureDisplay implements Display {

	public void display(double t, double h, double p) {
		System.out.println("-----------$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("-----------�¶ȣ�"+t+"  ʪ�ȣ�"+h+"  ѹ����"+p);
		System.out.println("-----------$$$$$$$$$$$$$$$$$$$$$$$$");
	}
 
	public void update(double t, double h, double p) {
		display(t,h,p);
	}

}
