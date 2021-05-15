package org.example.service;

public class TestService {

    private ResourceService resourceService;



    /**
     * 构造器注入
     * @param resourceService
     */
   /* public TestService(ResourceService resourceService) {
        this.resourceService = resourceService;
    }*/

    /**
     * set注入
     */
    public void setResourceService(ResourceService resourceService) {
        this.resourceService = resourceService;
    }



    public void test(){
        System.out.println("TestService...");
      //  resourceService.test();
    }
}
