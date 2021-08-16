package Singleton;

import state.HasMoney;

public class OrderNo {
    public static OrderNo instance = null;
    private int No = 1;
    public static int muchcount = 0;//买完东西后剩余的钱
    public static int count = 0;//相应物品的钱数
    public static int num = 0;


    public OrderNo() {
    }

    public static OrderNo getInstance(){
        if (instance == null){
            muchcount = HasMoney.icount-count;//减去饮品需要的钱数，再返回给，GiveGoods，结束
            System.out.println(num);
            num-=1;
            System.out.println(num);
            //减去饮品的数量
            System.out.println("获取订单");

            instance = new OrderNo();
            System.out.println(instance.getNo());
        }
        else {
            System.out.println("重复下单且与上一个未交易的订单相同，获取旧订单号");
            System.out.println(instance.getNo());
        }
        return instance;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        this.No = no;
    }

    public OrderNo(int no) {
        this.No = no;
    }
}
