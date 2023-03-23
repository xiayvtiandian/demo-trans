package com.example.springboot.inter.proxy.cglib;

import com.example.springboot.inter.impl.RobbImpl;
import org.springframework.cglib.proxy.Enhancer;

public class CGlibProxy {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        //设置委托类字节码文件
        enhancer.setSuperclass(RobbImpl.class);
        //设置回调函数
        enhancer.setCallback(new MyMethodInterceptor());
        //创建代理类
        RobbImpl proxy = (RobbImpl) enhancer.create();
        System.out.println(proxy.getClass());
        proxy.eatCabbage();
    }
}
