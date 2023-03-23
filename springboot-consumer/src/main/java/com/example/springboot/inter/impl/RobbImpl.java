package com.example.springboot.inter.impl;

import com.example.springboot.anno.GlobaleErrorCatch;
import com.example.springboot.inter.Robb;
import org.springframework.stereotype.Component;
@Component
public class RobbImpl implements Robb {
    @Override
    public void sayHello() {
        System.out.println("sayHello!");
    }

    @Override
    @GlobaleErrorCatch
    public void eatMushroom() {
        System.out.println("eatMushroom!");

    }

    @Override
    public void eatCabbage() {
        System.out.println("eatCabbage!");
    }

}
