package com.yang.dubbo.controller;

import com.yang.dubbo.comm.inter.TesterService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Reference(version = "1.0.0",timeout = 3000,stub = "com.yang.dubbo.service.stub.TestServiceStub")
    private TesterService testerService;

    @GetMapping("/test")
    public String test(@RequestParam("name")String name){
        return testerService.test(name);
    }

}
