package com.happypanda.feignclient.microserviceA.services;

import com.happypanda.feignclient.microserviceA.consumer.ServiceBRestConsumer;
import com.happypanda.feignclient.microserviceA.model.MessageDto;
import com.happypanda.feignclient.microserviceA.model.MicroserviceMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceA {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceA.class);
    private ServiceBRestConsumer restConsumer;

    @Autowired
    public ServiceA(ServiceBRestConsumer restConsumer) {
        this.restConsumer = restConsumer;
    }

    public MicroserviceMessage doBusiness() {
        LOGGER.info("Inside microservice A service");
        String messageFromMicroserviceB = doExternalBusiness();
        String messageFromMicroserviceA = doInternalBusiness();
        return new MicroserviceMessage(messageFromMicroserviceA, messageFromMicroserviceB);
    }

    private String doExternalBusiness() {
        MessageDto messageDto = restConsumer.consumeService();
        String dataFromServiceB =   messageDto.getMessageFromMicroservice();
        return  dataFromServiceB;
    }

    private String doInternalBusiness() {
        return "This is microservice A service";
    }
}
