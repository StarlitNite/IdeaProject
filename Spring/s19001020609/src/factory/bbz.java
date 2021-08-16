package factory;

public class bbz implements DrinkFactory,add{
    private static int num = 10;
    private int price = 3;
    private String name = "八宝粥";

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
                "价格:" + price + "元, 商品名:" + name
                ;
    }

    @Override
    public void add() {
        System.out.println("往贩卖机中加入了一瓶八宝粥。。。");
        num+=1;
        System.out.println("贩卖机中剩余"+num+"瓶"+name);
    }

    @Override
    public DrinkFactory MakeDrink() {
        return new bbz();
    }
}
