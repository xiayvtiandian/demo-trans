package com.example.springboot.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Pointcut("@annotation(com.example.springboot.anno.GlobaleErrorCatch)")
    public void test(){

    }
    @Around("test()")
    public void hanleGalobleResult(ProceedingJoinPoint point) throws Throwable{
        System.out.println("增强开始");
         point.proceed();
        System.out.println("增强结束");
    }
}
