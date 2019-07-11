package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringbootConsumeRestServiceApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SpringbootConsumeRestServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConsumeRestServiceApplication.class);
    }

    @Override
    public void run(String... args) {
        RestTemplate restTemplate = new RestTemplate();
        Employee instance = restTemplate.getForObject("https://reqres.in/api/users/2?delay=3", Employee.class);
        log.info(instance.toString());
        System.out.println();
        System.out.println(instance);
        System.out.println();
    }
}

