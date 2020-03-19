package com.happypanda.feignclient.microserviceA.consumer;

import com.happypanda.feignclient.microserviceA.model.MessageDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "serviceBConsumer", url = "${feign.consumerB.url}")
public interface ServiceBRestConsumer {

    @RequestMapping(method = RequestMethod.GET, path = "/api/microservices/b")
    MessageDto consumeService();
}
