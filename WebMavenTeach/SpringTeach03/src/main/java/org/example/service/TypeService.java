package org.example.service;

import org.example.dao.TypeDao;

public class TypeService {

    //private TypeDao typeDao = new TypeDao();
    //bean对象
    private TypeDao typeDao;
    //字符串类型  用于讲解构造器方法循环依赖
    private String host;
    //整型
    private Integer port;

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
/**
     * set方法注入
     *      需要给属性字段提供set方法
     */
    /*public void setTypeDao(TypeDao typeDao){
        this.typeDao = typeDao;
    }


    //字符串类型 用于构造器讲解
    private String host;
    //set方法
    public void setHost(String host) {
        this.host = host;
    }
    //整型
    private Integer port;
    //set方法
    public void setPort(Integer port) {
        this.port = port;
    }*/



    /**
     * 构造器注入
     *      1.通过构造器的形参设置属性字段的值
     */


    //
    public TypeService(TypeDao typeDao, String host, Integer port) {
        this.typeDao = typeDao;
        this.host = host;
        this.port = port;
    }

    public void test(){
        System.out.println("TypeService....");
        typeDao.test();
     // System.out.println("Host:"+host+",Port:"+port);
    }
}
