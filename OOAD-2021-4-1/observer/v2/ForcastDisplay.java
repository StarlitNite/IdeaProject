package observer.v2;

public class ForcastDisplay implements Display {
 
	public void display(double t, double h, double p) {
		System.out.println("�¶ȣ�"+t+"  ʪ�ȣ�"+h+"  ѹ����"+p);
	}
	public void update(double t, double h, double p) {
		display(t,h,p);
	}
}
 
