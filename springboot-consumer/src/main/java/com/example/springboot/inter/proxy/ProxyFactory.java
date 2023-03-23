package com.example.springboot.inter.proxy;


import com.example.springboot.inter.Robb;
import com.example.springboot.inter.impl.RobbImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("计算开始时间");
                        method.invoke(target,args);
                        System.out.println("计算结束时间");
                        return null;
                    }
                });
    }


    public static void main(String[] args) {
        RobbImpl robb = new RobbImpl();
        System.out.println(robb.getClass());
        //获取到动态代理类 jdk中是Proxy.newProxyInstance
        Robb robbPoxy = (Robb)new ProxyFactory(robb).getProxyInstance();
        System.out.println(robbPoxy.getClass());
        robbPoxy.eatCabbage();
    }
}
