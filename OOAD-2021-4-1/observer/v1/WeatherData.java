package observer.v1;

public class WeatherData {

	private observer.v1.CurrentDisplay currentDisplay = new CurrentDisplay();
	private observer.v1.StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
	private observer.v1.ForcastDisplay forcastDisplay = new ForcastDisplay();
	//future display+++++++1

	public double getTemprature() {//模拟从远程的气象站拉取数据pull data
		return (int)(Math.random()*50-20);
	}
	public double getHumidity() {//模拟从远程的气象站拉取数据pull data
		return (int)(Math.random()*100);
	}
	public double getPressure() {//模拟从远程的气象站拉取数据pull data
		return (int)(Math.random()*1000+1000);
	}
	public void measurementChanded() {
		double t = getTemprature();
		double h = getHumidity();
		double p = getPressure();
		//future display+++++++2
		currentDisplay.update(t,h,p);//通知显示元素display elements呈现最新数据
		statisticsDisplay.update(t,h,p);//通知显示元素display elements呈现最新数据
		forcastDisplay.update(t,h,p);//通知显示元素display elements呈现最新数据
	}
}

