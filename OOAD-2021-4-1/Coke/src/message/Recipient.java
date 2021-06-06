package message;
//收件人信息
public class Recipient {
	private String name;//收件人姓名
	private String email;//收件人邮箱
	
	public Recipient(String name,String email){
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString(){
		return name;
		
	}
	
}
