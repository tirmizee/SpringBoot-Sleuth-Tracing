package com.tirmizee.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    public final Logger LOG = LoggerFactory.getLogger(MainController.class);

    @GetMapping(path = "/")
    public String main() {
        LOG.info("main");
        return "Hello Service B";
    }

    @GetMapping(path = "/sleuth")
    public String sleuthB() {
        LOG.info("sleuthB");
        return "sleuthB";
    }

}
