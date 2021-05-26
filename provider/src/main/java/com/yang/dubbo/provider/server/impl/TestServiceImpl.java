package com.yang.dubbo.provider.server.impl;

import com.yang.dubbo.comm.inter.TesterService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service(version = "1.0.0", timeout = 3000)
@Component
public class TestServiceImpl implements TesterService {
    @Override
    public String test(String name) {
        return "welcome" + name;
    }
}
