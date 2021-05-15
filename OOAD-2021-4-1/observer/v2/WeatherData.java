package observer.v2;

public class WeatherData  extends Subject{//�����������������վͨ��	
	 
	public double getTemprature() {//ģ���Զ�̵�����վ��ȡ����pull data
		return (int)(Math.random()*50-20);
	}	 
	public double getHumidity() {//ģ���Զ�̵�����վ��ȡ����pull data
		return (int)(Math.random()*100);
	}	 
	public double getPressure() {//ģ���Զ�̵�����վ��ȡ����pull data
		return (int)(Math.random()*1000+1000);
	}	 	
	public void measurementChanged() {
		double t = getTemprature();
		double h = getHumidity();
		double p = getPressure();	 
		updateAll(t,h,p);
	}	 
}
 
