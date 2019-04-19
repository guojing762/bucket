package com.longshine.family.discoverydubboexamplecustomer.customer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.longshine.family.discoverydubboexamplefacade.facade.DemoService;
import org.springframework.stereotype.Service;

@Service
public class SayService {

    @Reference(version = "1.0",check = false)
    DemoService demoService;

    public String say(String name) {
        return demoService.sayName(name);
    }

}