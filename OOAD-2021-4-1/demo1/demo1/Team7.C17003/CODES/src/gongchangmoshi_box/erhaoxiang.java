package gongchangmoshi_box;

public class erhaoxiang implements Box{
	private String color;
	
	/**
	 * @param color
	 */
	public erhaoxiang(String color) {
		this.color = color;
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "erhaoxiang "+this.color;
	}

}
