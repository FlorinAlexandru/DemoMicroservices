package com.happypanda.feignclient.microserviceB.model;

import java.sql.Timestamp;

public class MicroserviceMessage {

    private final Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    private final String messageFromMicroservice;

    public MicroserviceMessage(String messageFromMicroservice) {
        this.messageFromMicroservice = messageFromMicroservice;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public String getMessageFromMicroservice() {
        return messageFromMicroservice;
    }

    @Override
    public String toString() {
        return "MicroserviceMessage{" +
                "timestamp=" + timestamp +
                ", messageFromMicroserviceA='" + messageFromMicroservice + '\'' +
                '}';
    }
}
