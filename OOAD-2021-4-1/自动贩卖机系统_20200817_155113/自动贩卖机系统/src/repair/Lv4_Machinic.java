package repair;
public class Lv4_Machinic extends Advance
{
	public void handleRequest(Repair_Request request)
	{
		if(request.getLeaveDays()<60)
		{
			System.out.println("���ϳ̶���[50%,60%]֮�䣬���Խ��ļ�������ά��");
		}
		else
		{
			System.out.println("���ϳ̶ȹ��ߣ��Ƽ���һ̨");
		}
	}
}