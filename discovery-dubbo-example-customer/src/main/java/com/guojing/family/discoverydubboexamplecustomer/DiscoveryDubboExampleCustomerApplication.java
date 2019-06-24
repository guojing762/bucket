package com.guojing.family.discoverydubboexamplecustomer;

import com.guojing.family.discoverydubboexamplecustomer.customer.SayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@ComponentScan(basePackages = {""})
@ComponentScan(basePackages={"com.guojing.family.discoverydubboexamplefacade.facade.*", "com.guojing.*"})
@ImportResource("classpath:consumer.xml")
public class DiscoveryDubboExampleCustomerApplication {

    @Autowired
    SayService sayService;

    @RequestMapping("/hello")
    public String say(@RequestParam("name") String name) {
        return sayService.say(name);
    }



    public static void main(String[] args) {
        SpringApplication.run(DiscoveryDubboExampleCustomerApplication.class, args);
    }

}
