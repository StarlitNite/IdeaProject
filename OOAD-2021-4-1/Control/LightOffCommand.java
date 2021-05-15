package Control;

public class LightOffCommand implements Command{
    private Light light;
    public LightOffCommand(Light light){
        super();
        this.light=light;
    }
    public void execute(){
        light.turnOff();
    }
}
