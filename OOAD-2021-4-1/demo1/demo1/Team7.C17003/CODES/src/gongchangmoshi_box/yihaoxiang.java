package gongchangmoshi_box;

public class yihaoxiang implements Box{
	private String color;
	
	/**
	 * @param color
	 */
	public yihaoxiang(String color) {
		this.color = color;
	}
	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "yihaoxiang "+this.color;
	}

}
