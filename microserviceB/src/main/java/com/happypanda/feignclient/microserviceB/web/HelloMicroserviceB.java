package com.happypanda.feignclient.microserviceB.web;

import com.happypanda.feignclient.microserviceB.model.HelloMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(method = RequestMethod.GET, path = "/api")
public class HelloMicroserviceB {

    @GetMapping(path = "hello")
    public HelloMessage hello() {
        return new HelloMessage("Hello microservice B");
    }
}
