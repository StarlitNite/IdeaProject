package com.example.factory;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 工厂接口实现类
 *  1. 通过构造器的形参传递要解析的配置文件
 *  2. 解析配置文件，得到对应的bean标签的id与class属性值，并设置对应的bean对象中，存放到list集合里
 *  3. 遍历List集合，得到每个Bean对象，得到class属性对应的实例化对象，并设置到map中，通过id与实例化bean对象
 *  4. 通过getBean方法，从map对象中通过id获取指定value，value即是实例化的对象
 */
public class MyClassPathXmlApplication implements MyFactory {

    //定义map对象，用来存放id属性与class属性实例化好的Bean对象
    private Map<String, Object> beanmap = new HashMap<>();
    //定义List集合，用来存放MyBean对象（MyBean用来存放bean标签对应的id与class属性值）
    private List<MyBean> beanList = null;



    /**
     * 1. 通过构造器的形参传递要解析的配置文件
     * @param fileName
     */
    public MyClassPathXmlApplication(String fileName) {
        /*解析配置文件*/
        parseXml(fileName);
        /*得到实例化对象*/
        instanceBean();
    }


    /**
     * 2. 解析配置文件，得到对应的bean标签的id与class属性值，并设置对应的bean对象中，存放到list集合里
     * @param fileName
     */
    private void parseXml(String fileName) {
       try {
           //得到解析器
           SAXReader reader = new SAXReader();
           //得到配置文件对应的URL
           URL url = this.getClass().getClassLoader().getResource(fileName);
           //解析配置文件，得到Document对象
           Document document = reader.read(url);
           //XPath 使用路径表达式来选取XML文档中的节点或节点集。
           //定义XPath语法，获取beans标签下的所有bean标签
           XPath xPath = document.createXPath("beans/bean");
           //通过xpath解析，得到对应的bean标签，返回Element集合
           List<Element> elementList = xPath.selectNodes(document);
           //判断Element集合是否为空
           if (elementList != null && elementList.size()>0 ){
               //实例化beanList集合
               beanList = new ArrayList<>();
               //遍历Element集合，得到Element对象，得到对应属性值
               for (Element element:elementList){
                   //得到对应的id属性值  attributeValue：通过指定属性名得到对应的属性值
                   String id = element.attributeValue("id");
                   //得到对应的class属性值
                   String clazz =element.attributeValue("class");
                   //将id属性值和class属性值设置到MyBean对象
                   MyBean myBean = new MyBean(id,clazz);
                   //将对应的MyBean对象设置到beanList集合中
                   beanList.add(myBean);
               }
           }
       }catch (Exception e){
           e.printStackTrace();
       }

    }

    /**
     * 3. 遍历List集合，得到每个Bean对象，得到class属性对应的实例化对象，并设置到map中，通过id与实例化bean对象
     */
    private void instanceBean() {
        try {
            //判断beanList是否为空
            if (beanList!=null&& beanList.size()>0){
                //遍历beanList集合，得到对应的MyBean的对象
                for (MyBean myBean:beanList){
                    //得到id值
                    String id = myBean.getId();
                    //得到class值
                    String clazz = myBean.getClazz();
                    //通过反射，实例化指定class属性值对应的Bean对象
                    Object object = Class.forName(clazz).newInstance();
                    //将id值与实例化好的bean对象，设置到map中
                    beanmap.put(id, object);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    /**
     * 通过getBean方法，从map对象中通过id获取指定value，value即是实例化的对象
     * @param id
     * @return
     */

    @Override
    public Object getBean(String id) {
        Object object = beanmap.get(id);
        return object;
    }
}
