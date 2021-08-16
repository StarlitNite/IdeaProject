package repair;
public abstract class Advance
{
	protected Advance successor;
	public void setSuccessor(Advance successor)
	{
		this.successor=successor;
	}
	public abstract void handleRequest(Repair_Request request);

}
