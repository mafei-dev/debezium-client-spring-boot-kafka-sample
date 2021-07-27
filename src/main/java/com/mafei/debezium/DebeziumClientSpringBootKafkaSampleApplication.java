package com.mafei.debezium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class DebeziumClientSpringBootKafkaSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DebeziumClientSpringBootKafkaSampleApplication.class, args);
    }

}
