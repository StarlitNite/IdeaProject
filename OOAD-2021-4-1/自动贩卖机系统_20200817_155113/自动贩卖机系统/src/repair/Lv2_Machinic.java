package repair;
public class Lv2_Machinic extends Advance
{
	public void handleRequest(Repair_Request request)
	{
		if(request.getLeaveDays()<30)
		{
			System.out.println("���ϳ̶���[10%,30%]֮�䣬֪ͨ����������ά��");
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