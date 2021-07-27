package com.mafei.debezium;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @KafkaListener(topics = {"dbserver1.inventory.customers"})
    public void consumeError(String message) {
        System.out.println("Listener.consumeError");
        System.out.println("message = " + message);
    }
}
