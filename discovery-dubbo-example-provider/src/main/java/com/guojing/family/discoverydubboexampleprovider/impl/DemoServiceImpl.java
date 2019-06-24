package com.guojing.family.discoverydubboexampleprovider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.guojing.family.discoverydubboexamplefacade.facade.DemoService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Author: guojing
 * @Date: 2019/4/18 15:58
 */
@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

    @Value("${demo.service.name}")
    private String serviceName;

    public String sayName(String name) {
        RpcContext rpcContext = RpcContext.getContext();
        return String.format("Service [name :%s , port : %d] %s(\"%s\") : Hello,%s",
                serviceName,
                rpcContext.getLocalPort(),
                rpcContext.getMethodName(),
                name,
                name);
    }
}