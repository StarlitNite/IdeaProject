package repair;
public class Lv1_Machinic extends Advance
{
	public void handleRequest(Repair_Request request)
	{
		if(request.getLeaveDays()<10)
		{
			System.out.println("���ϳ̶���[0%,10%]֮�䣬֪ͨһ��������ά��");
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