package repair;
public class Lv1_Machinic extends Advance
{
	public void handleRequest(Repair_Request request)
	{
		if(request.getLeaveDays()<10)
		{
			System.out.println("故障程度在[0%,10%]之间，通知一级技工来维修");
		}
		else
		{
			if(this.successor!=null)
			{
				this.successor.handleRequest(request);
			}
		}
	}
}