package factory;

public class jdl implements DrinkFactory,add{
    public static int num = 1;
    private int price = 6;
    private String name = "佳得乐运动饮料";
    @Override
    public DrinkFactory MakeDrink() {
        return new jdl();
    }

    public static int getNum() {
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
    public void add() {
        System.out.println("往贩卖机中加入了一瓶佳得乐运动饮料。。。");
        num+=1;/*.num+=1;*/
        System.out.println("贩卖机中剩余"+num+"瓶"+name);
    }
}
