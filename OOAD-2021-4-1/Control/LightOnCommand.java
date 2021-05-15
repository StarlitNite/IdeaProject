package Control;

public class LightOnCommand implements Command{
    private Light light;
    public LightOnCommand(Light light){
        super();
        this.light=light;
    }
    public void execute(){
        light.turnOn();
    }
}
