package gongchangmoshi_box;

public class BoxFactory {
	public Box productBoc(String box,String color) {
		if(box.equals("yihaoxiang")) {
			return new yihaoxiang(color);
		} else if(box.equals("erhaoxiang")) {
			return new erhaoxiang(color);
		} else if(box.equals("sanhaoxiang")) {
			return new sanhaoxiang(color);
		}
		else {
			return null;
		}
	}
}
