package observer.v1;

public class WeatherData {
 
	private CurrentDisplay currentDisplay = new CurrentDisplay();	 
	private StatisticsDisplay statisticsDisplay = new StatisticsDisplay();	 
	private ForcastDisplay forcastDisplay = new ForcastDisplay();
	//future display+++++++1
	 
	public double getTemprature() {//ģ���Զ�̵�����վ��ȡ����pull data
		return (int)(Math.random()*50-20);
	}	 
	public double getHumidity() {//ģ���Զ�̵�����վ��ȡ����pull data
		return (int)(Math.random()*100);
	}	 
	public double getPressure() {//ģ���Զ�̵�����վ��ȡ����pull data
		return (int)(Math.random()*1000+1000);
	}	 
	public void measurementChanded() {
		double t = getTemprature();
		double h = getHumidity();
		double p = getPressure();
		//future display+++++++2
		currentDisplay.update(t,h,p);//֪ͨ��ʾԪ��display elements������������
		statisticsDisplay.update(t,h,p);//֪ͨ��ʾԪ��display elements������������
		forcastDisplay.update(t,h,p);//֪ͨ��ʾԪ��display elements������������
	}	 
}
 
