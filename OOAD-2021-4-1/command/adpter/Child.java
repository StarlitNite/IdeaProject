package adpter;

/**
 * 适配器
 */
public class Child {
    private Duck duck;

    public Child(Duck duck) {
        this.duck = duck;
    }


    public void enquack() {
        duck.quack();
    }


    public void enfly() {
        duck.fly();
    }
}
