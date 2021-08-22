package Decorator;

public class Decorator implements Component{
    public Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void ice() {
        this.component.ice();
    }

    @Override
    public void hot() {
        this.component.hot();
    }
}
