package factory;

public class nF implements DrinkFactory,add{
    private static int num = 10;
    private int price = 2;
    private String name = "农夫山泉";

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
        return new nF();
    }

    @Override
    public void add() {
        System.out.println("往贩卖机中加入了一瓶农夫山泉。。。");
        num+=1;
        System.out.println("贩卖机中剩余"+num+"瓶"+name);
    }
}
