package repair;
public class Lv2_Machinic extends Advance
{
	public void handleRequest(Repair_Request request)
	{
		if(request.getLeaveDays()<30)
		{
			System.out.println("故障程度在[10%,30%]之间，通知二级技工来维修");
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