package com.longshine.family.discoverydubboexampleprovider.config;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@EnableDubbo(scanBasePackages = "com.longshine.family.discoverydubboexamplefacade.facade")
//@PropertySource(value = "classpath:/provider-config.properties")
@NacosPropertySource(dataId = "provider-config.properties", autoRefreshed = true)
public class DemoServiceProviderBootstrap {
}