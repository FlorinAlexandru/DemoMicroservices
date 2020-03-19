package com.happypanda.feignclient.microserviceB.model;

import java.sql.Timestamp;

public class HelloMessage {
    private final String message;
    private final Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public HelloMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "HelloMessage{" +
                "message='" + message + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
