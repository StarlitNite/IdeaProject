package observer.v1;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WeatherData  data = new WeatherData();
		while(true) {
			data.measurementChanded();
			Thread.sleep(5000);
		}

	}

}
