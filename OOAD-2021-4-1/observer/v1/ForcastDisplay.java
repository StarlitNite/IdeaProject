package observer.v1;

public class ForcastDisplay {
	public void display(double t, double h, double p) {
		System.out.print("�¶ȣ�"+t+"  ʪ�ȣ�"+h+"  ѹ����"+p);
	}
	public void update(double t, double h, double p) {
		display(t,h,p);
	}
	 
}
 
