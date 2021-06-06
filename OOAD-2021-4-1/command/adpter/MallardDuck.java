package adpter;

public class MallardDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("MallardDuck is quacking...");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck is flying...");
    }
}
