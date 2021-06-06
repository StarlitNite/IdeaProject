package adpter;


/**
 *
 */
public class Adapter implements Duck{
    private Turkey turkey;

    public Adapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
