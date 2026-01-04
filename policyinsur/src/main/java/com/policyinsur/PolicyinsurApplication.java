package com.policyinsur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PolicyinsurApplication {

    public static void main(String[] args) {
        SpringApplication.run(PolicyinsurApplication.class, args);
    }
}
