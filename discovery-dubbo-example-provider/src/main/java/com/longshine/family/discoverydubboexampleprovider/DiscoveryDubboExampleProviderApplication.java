package com.longshine.family.discoverydubboexampleprovider;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:provider.xml"})
public class DiscoveryDubboExampleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryDubboExampleProviderApplication.class, args);

    }

}
