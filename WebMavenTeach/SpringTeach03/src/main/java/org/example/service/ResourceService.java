package org.example.service;

public class ResourceService {

    private TestService testService;

    /**
     * 构造器注入
     */

    /*public ResourceService(TestService testService) {
        this.testService = testService;
    }*/



    /**
     * set方法注入
     */

    public void setTestService(TestService testService) {
        this.testService = testService;
    }


    public void test(){
        System.out.println("ResourceService...");
        testService.test();
    }
}
