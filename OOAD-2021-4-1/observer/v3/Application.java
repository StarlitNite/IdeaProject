package observer.v3;

import javax.swing.JFrame;

import observer.v2.CurrentDisplay;
import observer.v2.WeatherData;

public class Application {
	private JFrame frame;
	
	public Application() throws InterruptedException {
		frame = new JFrame("Weather Application");
		BarDisplay2 barObserver = new BarDisplay2();
		frame.add(barObserver.getView());
		frame.setSize(300, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		WeatherData data = new WeatherData();
		data.register(new CurrentDisplay());
		data.register(barObserver);
		
		while(true) {
			data.measurementChanged();
			Thread.sleep(5000);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		new Application();
	}
}