package com.happypanda.feignclient.microserviceA.model;

import java.sql.Timestamp;


public class MessageDto {

    private String messageFromMicroservice;
    private Timestamp timestamp;

    public MessageDto(String messageFromMicroservice, Timestamp timestamp) {
        this.messageFromMicroservice = messageFromMicroservice;
        this.timestamp = timestamp;
    }

    public String getMessageFromMicroservice() {
        return messageFromMicroservice;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "MessageDto{" +
                "messageFromMicroserviceB='" + messageFromMicroservice + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
