package Control;

public class Light {
    private int id;
    private boolean on;

    public Light(int id){
        super();
        this.id = id;
    }

    public boolean isOn(){
        return on;
    }
    public void turnOn() {
        this.on = true;
        System.out.println("#"+id+"Light is on!");
    }
    public void turnOff(){
        this.on = false;
        System.out.println("#"+id+"Light is off!");
    }
}
