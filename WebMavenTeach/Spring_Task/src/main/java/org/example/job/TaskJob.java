package org.example.job;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component //将对象交给IOC容器维护  IOC启动，对象也就实例化好了
public class TaskJob {

    public void job1(){
        System.out.println("任务1："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    public void job2(){
        System.out.println("任务2："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
