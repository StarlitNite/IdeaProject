package org.example.Action;

public class Starter {
    public static void main(String[] args) {
        //目标对象
        RentHouse target = new you();
        //代理对象(传递目标对象)
        AgencyProxy proxy = new AgencyProxy(target);
        //通过调用代理对象中的方法，执行目标对象的行为
        proxy.toRentHouse();

        //目标对象
        Marry target2 =new you();
        //代理对象
        MarryCompanyProxy proxy2 = new MarryCompanyProxy(target2);
        //调用方法
        proxy2.toMarry();
    }
}
