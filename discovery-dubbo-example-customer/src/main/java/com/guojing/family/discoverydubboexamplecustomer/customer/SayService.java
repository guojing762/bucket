package com.guojing.family.discoverydubboexamplecustomer.customer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.guojing.family.discoverydubboexamplecustomer.config.SelfConfigs;
import com.guojing.family.discoverydubboexamplefacade.facade.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SayService {

    @Reference(version = "${demo.service.version}",check = false)
    DemoService demoService;

    @Autowired
    SelfConfigs selfConfigs;

    public String say(String name) {
        String ss = selfConfigs.getUseLocalCache();
        return demoService.sayName(name) +"：" +ss;
    }

}