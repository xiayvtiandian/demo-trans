package com.example.springboot.inter.proxy;

import com.example.springboot.inter.Robb;
import com.example.springboot.inter.impl.RobbImpl;


public class RobbPoxy implements Robb {

    RobbImpl robb;

    public RobbPoxy(RobbImpl impl){
        robb = impl;
    }
    @Override
    public void sayHello() {
        System.out.println(getClass()+"proxy");
        robb.sayHello();
    }

    @Override
    public void eatMushroom() {
        System.out.println(getClass()+"proxy");
        robb.eatMushroom();
    }

    @Override
    public void eatCabbage() {
        System.out.println(getClass()+"proxy");

        robb.eatCabbage();
    }


}
