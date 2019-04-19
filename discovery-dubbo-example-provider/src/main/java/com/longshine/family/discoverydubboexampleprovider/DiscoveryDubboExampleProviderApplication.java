package com.longshine.family.discoverydubboexampleprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:provider.xml"})
public class DiscoveryDubboExampleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryDubboExampleProviderApplication.class, args);

    }

}
