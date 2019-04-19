package com.longshine.family.discoverydubboexampleprovider;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:provider.xml"})
//@NacosPropertySource(dataId = "provider-config.properties", autoRefreshed = true)
public class DiscoveryDubboExampleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryDubboExampleProviderApplication.class, args);

    }

}
