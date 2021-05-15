package observer.v2;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WeatherData data = new WeatherData();
		data.register(new CurrentDisplay());
		data.register(new ForcastDisplay());
		data.register(new StatisticsDisplay());
		data.register(new FutureDisplay());
		
		while(true) {
			data.measurementChanged();
			Thread.sleep(5000);
		}

	}

}
