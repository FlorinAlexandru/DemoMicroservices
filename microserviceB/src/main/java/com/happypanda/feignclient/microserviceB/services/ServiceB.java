package com.happypanda.feignclient.microserviceB.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ServiceB {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceB.class);

    public String doBusiness() {
        LOGGER.info("Inside microservice B service");
        return "This is microservice B service";
    }
}
