package Decorator;

public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }
    public void ice(){
        this.component.ice();
    }
    public void hot(){
        this.component.hot();
    }
}
