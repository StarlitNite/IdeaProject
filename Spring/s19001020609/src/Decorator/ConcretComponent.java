package Decorator;

public class ConcretComponent implements Component{

    @Override
    public void ice() {
        System.out.println("已为您冷藏。。");
    }

    @Override
    public void hot() {
        System.out.println("已为您加热。。");
    }

}
