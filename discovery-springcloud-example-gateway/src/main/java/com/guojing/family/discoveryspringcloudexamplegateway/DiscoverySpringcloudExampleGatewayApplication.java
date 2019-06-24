package com.guojing.family.discoveryspringcloudexamplegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DiscoverySpringcloudExampleGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoverySpringcloudExampleGatewayApplication.class, args);
    }

}
