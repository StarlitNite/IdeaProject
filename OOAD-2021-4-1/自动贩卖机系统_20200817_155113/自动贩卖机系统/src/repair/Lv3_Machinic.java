package repair;
public class Lv3_Machinic extends Advance
{
	public void handleRequest(Repair_Request request)
	{
		if(request.getLeaveDays()<50)
		{
			System.out.println("���ϳ̶���[30%,50%]֮�䣬֪ͨ����������ά��");
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