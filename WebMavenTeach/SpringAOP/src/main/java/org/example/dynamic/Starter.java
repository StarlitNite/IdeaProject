package org.example.dynamic;

import org.example.Action.*;

public class Starter {
    public static void main(String[] args) {
        //目标对象
        Marry target = new you();
        //得到代理类
        JdkProxy jdkProxy = new JdkProxy(target);
        //得到代理对象
        Object obj = jdkProxy.getProxy();
    }
}
