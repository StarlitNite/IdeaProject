package org.example.Service;

import org.example.Dao.TypeDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Autowired注解
 *      实现Bean对象的自动注入
 *          1.默认根据类型（Class）查找，与属性字段名无关
 *          2.属性字段可以提供set方法 也可以不提供
 *          3.注解可以声明在属性字段级别或set方法级别
 *          4.如果需要设置属性字段通过id属性值查找，则需要结合@qualifier注解使用，并设置@qualifier注解的value属性值（value属性值与bean标签id属性值一致）
 */
public class TypeService {

    @Autowired//不能加错位置，不然会报Injection of autowired dependencies failed; nested exception is java.lang.NullPointerException
    private TypeDao typeDao;

    public void test(){
        System.out.println("TypeService...");
    typeDao.test();
    }
}
