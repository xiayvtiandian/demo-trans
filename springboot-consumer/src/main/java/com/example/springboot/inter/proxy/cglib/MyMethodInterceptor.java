package com.example.springboot.inter.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("计算开始时间");
        methodProxy.invokeSuper(o,objects);
        System.out.println("计算结束时间");
        return o;
    }

}
