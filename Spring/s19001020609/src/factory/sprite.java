package factory;

public class sprite implements DrinkFactory,add{
    private static int num = 10;
    private int price = 3;
    private String name = "雪碧";

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return new sprite();
    }

    @Override
    public void add() {
        System.out.println("往贩卖机中加入了一瓶雪碧。。。");
        num+=1;
        System.out.println("贩卖机中剩余"+num+"瓶"+name);
    }
}
