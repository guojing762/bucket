package com.longshine.family.discoverydubboexampleprovider.config;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@EnableDubbo(scanBasePackages = "com.longshine.family.discoverydubboexamplefacade.facade")
@PropertySource(value = "classpath:/provider-config.properties")
@Configuration
public class DemoServiceProviderBootstrap {
}
