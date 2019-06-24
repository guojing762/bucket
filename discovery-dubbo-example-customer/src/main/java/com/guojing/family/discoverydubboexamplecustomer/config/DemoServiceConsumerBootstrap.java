package com.guojing.family.discoverydubboexamplecustomer.config;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.context.annotation.Configuration;

@EnableDubbo
@Configuration
//@PropertySource(value = "classpath:/provider-config.properties")
@NacosPropertySource(dataId = "consumer-config.properties", autoRefreshed = true)
public class DemoServiceConsumerBootstrap {

}