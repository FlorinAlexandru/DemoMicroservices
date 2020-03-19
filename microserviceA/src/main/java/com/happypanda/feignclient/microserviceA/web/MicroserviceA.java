package com.happypanda.feignclient.microserviceA.web;

import com.happypanda.feignclient.microserviceA.model.MicroserviceMessage;
import com.happypanda.feignclient.microserviceA.services.ServiceA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/microservices/")
public class MicroserviceA {

    private static final Logger LOGGER = LoggerFactory.getLogger(MicroserviceA.class);
    private final ServiceA serviceA;

    @Autowired
    public MicroserviceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    @GetMapping(path = "a")
    public MicroserviceMessage doBusiness() {
        LOGGER.info("inside microservice A controller");
        return serviceA.doBusiness();
    }

}
