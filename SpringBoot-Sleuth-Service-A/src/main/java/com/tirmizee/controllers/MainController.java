package com.tirmizee.controllers;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@AllArgsConstructor
public class MainController {

    public final Logger LOG = LoggerFactory.getLogger(MainController.class);

    private final RestTemplate restTemplate;

    @GetMapping(path = "/")
    public String main() {
        LOG.info("main");
        return "Hello Service A";
    }

    @GetMapping(path = "/sleuth")
    public String sleuthA() {
        LOG.info("sleuthA");
        ResponseEntity<String> result = restTemplate.getForEntity("http://localhost:8081/service-b/sleuth", String.class);
        return result.getBody();
    }

}
