package com.example.animal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoggingController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping("/log")
    public Map<String, Object> hello(){
        Map<String, Object> result = new HashMap<>();
        result.put("name","Stephan");
        logger.info("this is a info Message.");
        logger.warn("this is a warning message.");
        logger.error("this is a error message.");
        return result;
    }
}
