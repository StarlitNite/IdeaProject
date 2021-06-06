package repair;
public class Lv3_Machinic extends Advance
{
	public void handleRequest(Repair_Request request)
	{
		if(request.getLeaveDays()<50)
		{
			System.out.println("故障程度在[30%,50%]之间，通知三级技工来维修");
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