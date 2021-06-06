package adpter;

public class Test {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Child tom = new Child(duck);
        tom.enfly();
        tom.enquack();

        Child jerry = new Child( new Adapter(turkey));
        jerry.enquack();
        jerry.enfly();


    }
}
