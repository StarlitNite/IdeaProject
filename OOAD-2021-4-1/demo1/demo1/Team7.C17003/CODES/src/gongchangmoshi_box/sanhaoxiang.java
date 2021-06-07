package gongchangmoshi_box;

public class sanhaoxiang implements Box{
	private String color;
	
	/**
	 * @param color
	 */
	public sanhaoxiang(String color) {
		this.color = color;
	}
	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "sanhaoxiang "+this.color;
	}

}
