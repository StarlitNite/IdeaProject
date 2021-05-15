package org.example.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component //将对象交给IOC容器维护  IOC启动，对象也就实例化好了
public class TaskJob02 {
    @Scheduled(cron = "0/2 * * * * *")
    public void job1(){
        System.out.println("任务1："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    @Scheduled(cron = "0/5 * * * * *")
    public void job2(){
        System.out.println("任务2："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
