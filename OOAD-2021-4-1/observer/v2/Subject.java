package observer.v2;

import java.util.ArrayList;

public class Subject {//�����������ά��������͹۲��ߡ�֮��Ĺ�ϵ
	private ArrayList<Display> display = new ArrayList<Display>();//������ϵ����
	
	public void register(Display d) {//ע���µ���ʾԪ�ض���
		display.add(d);
	}
	
	public void updateAll(double t,double h,double p) {
		for(Display d:display) {
			d.update(t,h,p);
		}
	}
}
