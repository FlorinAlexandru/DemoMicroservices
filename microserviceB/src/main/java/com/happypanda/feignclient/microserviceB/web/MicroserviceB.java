package com.happypanda.feignclient.microserviceB.web;

import com.happypanda.feignclient.microserviceB.model.MicroserviceMessage;
import com.happypanda.feignclient.microserviceB.services.ServiceB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/microservices/")
public class MicroserviceB {
    private static final Logger LOGGER = LoggerFactory.getLogger(MicroserviceB.class);
    private final ServiceB serviceB;

    @Autowired
    public MicroserviceB(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    @GetMapping(path = "b")
    public MicroserviceMessage doBusiness() {
        LOGGER.info("inside microservice B controller");
        MicroserviceMessage message = new MicroserviceMessage(serviceB.doBusiness());
        return message;
    }

}
