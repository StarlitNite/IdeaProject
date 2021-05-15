package observer.v2;

public class WeatherData  extends Subject{//该类仅仅负责与气象站通信	
	 
	public double getTemprature() {//模拟从远程的气象站拉取数据pull data
		return (int)(Math.random()*50-20);
	}	 
	public double getHumidity() {//模拟从远程的气象站拉取数据pull data
		return (int)(Math.random()*100);
	}	 
	public double getPressure() {//模拟从远程的气象站拉取数据pull data
		return (int)(Math.random()*1000+1000);
	}	 	
	public void measurementChanged() {
		double t = getTemprature();
		double h = getHumidity();
		double p = getPressure();	 
		updateAll(t,h,p);
	}	 
}
 
