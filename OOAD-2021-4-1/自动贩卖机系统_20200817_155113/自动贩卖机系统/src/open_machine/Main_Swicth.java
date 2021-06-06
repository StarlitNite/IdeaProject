package open_machine;


public class Main_Swicth
{
    private Light light;
    private Screen screen;
    private Net_control net;
    public Main_Swicth()
    {
    	light = new Light();
    	screen = new Screen();
    	net = new Net_control();
    }
    public void Activate()
    {
    	System.out.println("开启自动贩卖机");
    	light.TurnOn();
    	screen.TurnOn();
    	net.TurnOn();
    }
    public void Deactivate()
    {
    	System.out.println("关闭自动贩卖机");
    	light.TurnOff();
    	screen.TurnOff();
    	net.TurnOff();
    }
}