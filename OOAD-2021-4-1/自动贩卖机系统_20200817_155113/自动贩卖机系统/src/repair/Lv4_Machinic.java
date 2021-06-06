package repair;
public class Lv4_Machinic extends Advance
{
	public void handleRequest(Repair_Request request)
	{
		if(request.getLeaveDays()<60)
		{
			System.out.println("故障程度在[50%,60%]之间，可以叫四级技工来维修");
		}
		else
		{
			System.out.println("故障程度过高，推荐换一台");
		}
	}
}