package org.happypanda.demomicroservices.gatewaywithzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayWithZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayWithZuulApplication.class, args);
    }

}
