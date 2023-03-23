package com.example.springboot.proviod.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springboot.entity.User;
import com.example.springboot.mapper.DemoMapper;
import com.example.stub.intf.TestDubboExportService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

@Service(version = "1.0")
public class TestDubboExportServiceImpl implements TestDubboExportService {
    @Autowired
    private DemoMapper demoMapper;

    @Override
    public String testExport(String export) {
        User user = new User();
        user.setName("111");
        Integer integer = demoMapper.selectCount(new QueryWrapper<>(user));
        return String.valueOf(integer);
    }
}
