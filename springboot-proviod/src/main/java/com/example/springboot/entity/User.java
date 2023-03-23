package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("mydb.user")
public class User {
    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
