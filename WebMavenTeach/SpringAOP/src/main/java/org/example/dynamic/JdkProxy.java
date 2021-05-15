package org.example.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy {
    //目标对象
    private Object target;
    //通过带参构造器传递目标对象
    public JdkProxy(Object target) {
        this.target = target;
    }

    /**
     * 通过调用代理类中的静态方法newProxyInstance(),得到代理对象
     * 返回一个指定接口的代理类的实例方法调用分派到指定的调用处理程序。(返回代理对象)
     *  loader:一个ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载
     *  interfaces: 一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，如果
     *             我提供了一组接口给它，那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了
     *  h:一个InvocationHandler接口，表示代理实例的调用处理程序实现的接口。每个代理实例都具有一个关联的调用
     *  处理程序。对代理实例调用方法时，将对方法调用进行编码并将其指派到它的调用处理程序的 invoke方法（传入InvocationHandler接口的子类)
     *  public static Object newProxyInstance(ClassLoader loader,
     *                                      Class<?>[] interfaces,
     *                                      InvocationHandler h)
     */
    public Object getProxy(){


        //类加载器 定义了由哪个ClassLoader对象来对生成的代理对象进行加载
        ClassLoader loader = this.getClass().getClassLoader();
        //要代理的对象提供一组什么接口
        Class[] interfaces = target.getClass().getInterfaces();
        //一个InvocationHandler接口，表示代理实例的调用处理程序实现的接口。每个代理实例都具有一个关联的调用
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("test...");
                return null;
            }
        };
        //调用方法 得到代理对象
        Object object = Proxy.newProxyInstance(loader, interfaces, invocationHandler);


        return object;
    }

}
