package com.example.factory;

/**
 * 工厂模式
 *      自定义工厂类
 */
public interface MyFactory {

    //通过id属性值获取实例化对象
    public Object getBean(String id);


}


