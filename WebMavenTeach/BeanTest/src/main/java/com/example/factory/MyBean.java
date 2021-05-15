package com.example.factory;
/*
* Bean属性对象
*       用来存放配置文件中的bean标签的id与class属性值
* */
public class MyBean {
    private String id;//bean标签对应的id属性值
    private String clazz;//bean标签对应的class属性值

    public MyBean(String id, String clazz) {
        this.id = id;
        this.clazz = clazz;
    }

    public MyBean() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
