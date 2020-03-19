package com.happypanda.feignclient.microserviceA.model;

import java.sql.Timestamp;

public class MicroserviceMessage {

    private final Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    private String messageFromMicroserviceA;
    private String messageFromMicroserviceB;

    public MicroserviceMessage(String messageFromMicroserviceA, String messageFromMicroserviceB) {
        this.messageFromMicroserviceA = messageFromMicroserviceA;
        this.messageFromMicroserviceB = messageFromMicroserviceB;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public String getMessageFromMicroserviceA() {
        return messageFromMicroserviceA;
    }

    public String getMessageFromMicroserviceB() {
        return messageFromMicroserviceB;
    }

    @Override
    public String toString() {
        return "MicroserviceMessage{" +
                "timestamp=" + timestamp +
                ", messageFromMicroserviceA='" + messageFromMicroserviceA + '\'' +
                ", messageFromMicroserviceB='" + messageFromMicroserviceB + '\'' +
                '}';
    }
}
