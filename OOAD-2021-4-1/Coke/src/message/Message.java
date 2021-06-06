package message;
//邮件类--原型模式（浅克隆）
public class Message implements Cloneable {
	String sender;//发送方
	Recipient recipient;//收件人
	public Message(String sender,Recipient recipient){
		this.sender = sender;
		this.recipient = recipient;
	}
	
	public Object clone(){//克隆方法
		Message clone = null;
		try{
			clone = (Message) super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return clone;
	}

	
	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public Recipient getRecipient() {
		return recipient;
	}

	public void setRecipient(Recipient recipient) {
		this.recipient = recipient;
	}	
	
	
	
}
