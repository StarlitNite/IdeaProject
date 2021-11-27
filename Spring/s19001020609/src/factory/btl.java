package factory;

public class btl implements DrinkFactory,add{
    public static int num = 10;
    private int price = 4;
    private String name = "宝特力矿泉水";

    public int getNum() {
        return num;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                "价格:" + price +
                        "元, 商品名:" + name
                ;
    }

    @Override
    public DrinkFactory MakeDrink() {
        return new btl();

    }

    @Override
    public void add() {
        System.out.println("往贩卖机中加入了一瓶宝特力矿泉水。。。");
        num+=1;
        System.out.println("贩卖机中剩余"+num+"瓶"+name);
    }
}
