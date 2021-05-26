package com.yang.dubbo.service.stub;

import com.yang.dubbo.comm.inter.TesterService;

public class TestServiceStub implements TesterService {
    private TesterService testerService;

    public TestServiceStub(TesterService testerService) {
        this.testerService = testerService;
    }

    @Override
    public String test(String name) {
        if (name.startsWith("w")){
            return testerService.test(name);
        }
        return "error";
    }
}
