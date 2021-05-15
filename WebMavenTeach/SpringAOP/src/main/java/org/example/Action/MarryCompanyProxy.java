package org.example.Action;

import org.example.Action.Marry;

public class MarryCompanyProxy implements Marry {

    //目标对象
    private Marry target;
    //通过构造器传递目标对象
    public MarryCompanyProxy(Marry target) {
        this.target = target;
    }

    @Override
    public void toMarry() {

        System.out.println("结婚前...");

        //调用目标对象中的方法
        target.toMarry();

        System.out.println("结婚后...");
    }
}
