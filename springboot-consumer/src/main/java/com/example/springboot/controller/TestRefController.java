package com.example.springboot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.stub.intf.TestDubboExportService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestRefController {

    @Reference(version = "1.0")
    TestDubboExportService testDubboExportService;
    @RequestMapping("/hello")
    public String testRef(){
        String hello = testDubboExportService.testExport("hello");
        return hello;
    }
}
